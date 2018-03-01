package tabularmethod104;

public class mlinkedlist {

	node head = null;
	int arraysizeforTheVAlue = 0;
	int size = 0;
	boolean empty = true;

	public void add(int[] minterm, int value, int count, boolean flag) {
		int numberOfOnesInTheMinterm = Integer.bitCount(minterm[0]);
		// System.out.println(numberOfOnesInTheMinterm);
		int counterOFtheLinkedListDepth = 0;
		node traceBottom = head;
		boolean flag1 = true;
		while (counterOFtheLinkedListDepth <= numberOfOnesInTheMinterm) {
			// create new level if not found
			if (head == null) {
				empty = false;
				node newnode = new node(arraysizeforTheVAlue);
				head = newnode;
				traceBottom = head;
			} 

			else if (traceBottom.bottom == null) {
				node newnode = new node(arraysizeforTheVAlue);
				traceBottom.bottom = newnode;
				traceBottom = traceBottom.bottom;
				if (flag1 == true) {
					counterOFtheLinkedListDepth++;
					flag1 = false;
				}
			} else {
				traceBottom = traceBottom.bottom;
				if (flag1 == true) {
					counterOFtheLinkedListDepth++;
					flag1 = false;
				}
			}
			counterOFtheLinkedListDepth++;
		}
		node traceRight = traceBottom;
		while (traceRight.right != null)
			traceRight = traceRight.right;
		node newnode = new node(arraysizeforTheVAlue);
		traceRight.right = newnode;
		for (int i = 0; i < newnode.value.length; i++)
			newnode.value[i] = minterm[i];
		if (flag == true)
			newnode.value[count] = value;
		sortinsertion(newnode.value);
	}

	public void addfirst(int[] minterm, int value, int count, boolean flag) {
		int numberOfOnesInTheMinterm = Integer.bitCount(minterm[0]);
		// System.out.println(numberOfOnesInTheMinterm);
		int counterOFtheLinkedListDepth = 0;
		node traceBottom = head;
		while (counterOFtheLinkedListDepth <= numberOfOnesInTheMinterm) {
			// create new level if not found
			if (head == null) {
				empty = false;
				node newnode = new node(arraysizeforTheVAlue);
				head = newnode;
				traceBottom = head;
			} 
			else if (numberOfOnesInTheMinterm==0){}
			else if (traceBottom.bottom == null) {
				node newnode = new node(arraysizeforTheVAlue);
				traceBottom.bottom = newnode;
				traceBottom = traceBottom.bottom;
			} else {
				traceBottom = traceBottom.bottom;
			}
			counterOFtheLinkedListDepth++;
		}
		node traceRight = traceBottom;
		while (traceRight.right != null)
			traceRight = traceRight.right;
		node newnode = new node(arraysizeforTheVAlue);
		traceRight.right = newnode;
		for (int i = 0; i < newnode.value.length; i++)
			newnode.value[i] = minterm[i];
		if (flag == true)
			newnode.value[count] = value;
		sortinsertion(newnode.value);
	}
	void addlast(int minterm, int[] value) {

		node trace = head;
		if (head == null) {
			node newnode = new node(arraysizeforTheVAlue);
			head = newnode;
			for (int i = 0; i < newnode.value.length; i++)
				newnode.value[i] = value[i];
			newnode.value[0] = minterm;
		} else {
			while (trace.right != null)
				trace = trace.right;

			node newnode = new node(arraysizeforTheVAlue);
			trace.right = newnode;
			for (int i = 0; i < newnode.value.length; i++)
				newnode.value[i] = value[i];
			newnode.value[0] = minterm;
		}
		size++;

	}

	// while taking the values from the user for the first time apply it on the
	// max minterm
	public void determineTheLengthOfTheArray(int TheLOngestNumberOFTheMinterms) {
		arraysizeforTheVAlue = (int) Math.ceil((Math.log(TheLOngestNumberOFTheMinterms) / Math.log(2))) + 1;
	}

	public void removeDuplicate() {

		node traceDepth = head;
		while (traceDepth != null) {
			node trace = traceDepth.right;
			int count = 0;
			while (trace != null) {

				node traceRight = trace.right;
				int counter = count + 1;
				while (traceRight != null) {

					boolean flag = false;
					for (int i = 0; i < trace.value.length; i++) {
						if (trace.value[i] == traceRight.value[i]) {
							flag = true;
						} else {
							flag = false;
							break;
						}
					}
					if (flag == true) {

						node last = traceDepth.right;
						for (int i = 0; i < counter - 1; i++)
							last = last.right;

						last.right = last.right.right;
					} else {
						counter++;
					}
					traceRight = traceRight.right;
				}
				count++;
				trace = trace.right;
			}
			traceDepth = traceDepth.bottom;
		}
	}

	void print() {
		int j = 0;
		node traceBottom = head;
		while (traceBottom != null) {
			node traceRight = traceBottom.right;
			while (traceRight != null) {
				int i = 0;
				System.out.print(traceRight.value[0] + "             ");
				while (traceRight.value[i] != 0) {
					System.out.print(traceRight.value[i] + "             ");
					i++;
				}
				System.out.println();
				traceRight = traceRight.right;
			}
			System.out.println("----------------------------------------------level " + j
					+ "-----------------------------------------------------------");
			j++;
			traceBottom = traceBottom.bottom;
		}
	}

	void printlast() {

		node trace = head;
		while (trace != null) {
			int i = 0;
			System.out.print(trace.value[0] + "             ");
			while (trace.value[i] != 0) {
				System.out.print(trace.value[i] + "             ");
				i++;
			}
			System.out.println();
			trace = trace.right;
		}

	}

	public void sortinsertion(int arr[]) {

		for (int i = 1; i < arr.length; i++) {

			int temp = arr[i];
			int pos = i;

			while (pos > 1 && temp > arr[pos - 1]) {

				arr[pos] = arr[pos - 1];
				pos--;
			}
			arr[pos] = temp;
		}
	}

	void testIfPrimeImplicant(int[] dontCare, int numOFDontcare) {

		node trace = head;
		int count = 0;
		while (trace != null) {
			for (int i = 0; i < numOFDontcare; i++) {
				boolean flag = false;
				if (trace.value[0] == dontCare[i]) {
					for (int j = 1; j < trace.value.length; j++) {
						if (trace.value[j] == 0)
							flag = true;
						else {
							flag = false;
							break;
						}
					}
				}
				if (flag == true) {
					if (count == 0) {
						head = trace.right;
					} else {
						node last = head;
						for (int s = 0; s < count - 1; s++) {
							last = last.right;
						}
						last.right = last.right.right;
					}
					size--;

				} else
					count++;
			}
			trace = trace.right;
		}
	}
}
