package tabularmethod104;

public class AllPrimeiPmlicants {

	mlinkedlist primeImplicants = new mlinkedlist();
	boolean noPrimeimplicantcombinedTogether = false;
	int counter = 1;

	// call only this
	public int[][] theAnswer(mlinkedlist minterms, int TheLOngestNumberOFTheMinterms, int[] dontCare,int numOFDontcare) {
		if(minterms.empty == true)
			return null;
		primeImplicants.determineTheLengthOfTheArray(TheLOngestNumberOFTheMinterms);
		compineThegivenMintermsTogetherIfPossible(minterms, TheLOngestNumberOFTheMinterms);
		primeImplicants.testIfPrimeImplicant(dontCare, numOFDontcare);//remove don't care terms
		int[][] arr = new int[primeImplicants.size][primeImplicants.head.value.length];
		convertToArray(arr);
		return arr;
	}

	void convertToArray(int[][] arr) {
		node trace = primeImplicants.head;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = trace.value[j];
			}
			trace = trace.right;
		}
		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[0].length; j++) {
				if (arr[i][j] == 0)
					arr[i][j] = 177;
			}
		}*/
	}

	// checked
	private void compineThegivenMintermsTogetherIfPossible(mlinkedlist minterms, int TheLOngestNumberOFTheMinterms) {

		minterms.removeDuplicate();
		System.out.println(
				"******************************************** minterms********************************************");
		minterms.print();

		noPrimeimplicantcombinedTogether = false;
		mlinkedlist step = new mlinkedlist();
		step.determineTheLengthOfTheArray(TheLOngestNumberOFTheMinterms);
		TraceEachRowInThemlinkedlist(step, minterms);
		RunningInAllNodesTotransferNodesWhichHasNotCombinedToTheAnswer(minterms);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(
				"**********************************************PrimeImlicants*******************************************");
		primeImplicants.printlast();

		if (noPrimeimplicantcombinedTogether == true) {
			counter++;
			compineThegivenMintermsTogetherIfPossible(step, TheLOngestNumberOFTheMinterms);
		}
	}

	// checked
	private void RunningInAllNodesTotransferNodesWhichHasNotCombinedToTheAnswer(mlinkedlist minterms) {

		node tracedepthi = minterms.head;
		while (tracedepthi != null) {
			addToTheAnswerIfHasFalseFlag(tracedepthi);
			tracedepthi = tracedepthi.bottom;
		}
	}

	// may
	private void addToTheAnswerIfHasFalseFlag(node tracedepthi) {
		node traceRight = tracedepthi.right;// first node is just an indicator
											// to the number of ones
		while (traceRight != null) {
			if (traceRight.flag == false)
				primeImplicants.addlast(traceRight.value[0], traceRight.value);
			traceRight = traceRight.right;
		}
	}

	// checked
	private void TraceEachRowInThemlinkedlist(mlinkedlist step, mlinkedlist minterms) {

		node tracedepth = minterms.head;
		while (tracedepth.bottom != null) {
			TraceEachNodeOfRowInThemlinkedlistINFirstGroup(step, tracedepth);
			tracedepth = tracedepth.bottom;
		}
	}

	// checked
	private void TraceEachNodeOfRowInThemlinkedlistINFirstGroup(mlinkedlist step, node tracedepth) {

		node traceRight = tracedepth.right;// first node is just an indicator
											// to the number of ones
		while (traceRight != null) {
			TraceEachNodeOfRowInThemlinkedlistINSecondGroup(step, traceRight, tracedepth);
			traceRight = traceRight.right;
		}
	}

	// checked
	private void TraceEachNodeOfRowInThemlinkedlistINSecondGroup(mlinkedlist step, node traceRight, node tracedepth) {

		node trace = tracedepth.bottom.right;// first node is just an indicator
												// to the number of ones
		while (trace != null) {
			BitWiseTheTwoMInTermsTogether(step, trace, traceRight);
			trace = trace.right;
		}
	}

	// checked
	private void BitWiseTheTwoMInTermsTogether(mlinkedlist step, node trace, node traceRight) {

		float checkUsingBitWiseXOR = trace.value[0] ^ traceRight.value[0];
		checkUsingBitWiseXOR = (float) (Math.log(checkUsingBitWiseXOR) / Math.log(2));
		CheckIfCanBeCombined(step, trace, traceRight, checkUsingBitWiseXOR);
	}

	// checked
	private void CheckIfCanBeCombined(mlinkedlist step, node trace, node traceRight, float checkUsingBitWiseXOR) {
		if (checkUsingBitWiseXOR - Math.ceil(checkUsingBitWiseXOR) == 0)
			checkToBeEqualInDashes(step, trace, traceRight, checkUsingBitWiseXOR);

	}

	// checked
	private void checkToBeEqualInDashes(mlinkedlist step, node trace, node traceRight, float checkUsingBitWiseXOR) {

		boolean flag = false;
		for (int i = 1; i < trace.value.length; i++) {
			flag = CheckForDashesToBeInTheSamePlaec(trace.value[i], traceRight.value[i]);
			if (flag == true)
				continue;
			else
				break;
		}
		if (flag == true)
			transferNewValuesToTheNewmlinkedlistIfCanCombine(step, trace, traceRight, checkUsingBitWiseXOR);
	}

	// TODO prime minterms must be checked there is more than desired
	private void transferNewValuesToTheNewmlinkedlistIfCanCombine(mlinkedlist step, node trace, node traceRight,
			float checkUsingBitWiseXOR) {
		if (step.empty==true || traceRight.value[0]==0)
			step.addfirst(traceRight.value, (int) Math.pow(2, (int) checkUsingBitWiseXOR), counter, true);
		else
			step.add(traceRight.value, (int) Math.pow(2, (int) checkUsingBitWiseXOR), counter, true);
		// +1 => so as not to be zero as it is the initial of values[]
		// change the value[i] to the position of '-'
		// change flag in minterms mlinkedlist
		trace.flag = true;
		traceRight.flag = true;
		noPrimeimplicantcombinedTogether = true;
	}

	// checked
	private boolean CheckForDashesToBeInTheSamePlaec(int num1, int num2) {

		if (num1 == num2)
			return true;
		else
			return false;
	}
}
