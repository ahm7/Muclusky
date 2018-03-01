package tabularmethod104;

public class print {

	private String[][] Alphapetical = new String[26][2];

	public void ss() {

		Alphapetical[0][0] = "A";
		Alphapetical[0][1] = "A'";
		Alphapetical[1][0] = "B";
		Alphapetical[1][1] = "B'";
		Alphapetical[2][0] = "C";
		Alphapetical[2][1] = "C'";
		Alphapetical[3][0] = "D";
		Alphapetical[3][1] = "D'";
		Alphapetical[4][0] = "E";
		Alphapetical[4][1] = "E'";
		Alphapetical[5][0] = "F";
		Alphapetical[5][1] = "F'";
		Alphapetical[6][0] = "G";
		Alphapetical[6][1] = "G'";
		Alphapetical[7][0] = "H";
		Alphapetical[7][1] = "H'";
		Alphapetical[8][0] = "I";
		Alphapetical[8][1] = "I'";
		Alphapetical[9][0] = "J";
		Alphapetical[9][1] = "J'";
		Alphapetical[10][0] = "K";
		Alphapetical[10][1] = "K'";
		Alphapetical[11][0] = "L";
		Alphapetical[11][1] = "L'";
		Alphapetical[12][0] = "M";
		Alphapetical[12][1] = "M'";
		Alphapetical[13][0] = "N";
		Alphapetical[13][1] = "N'";
		Alphapetical[14][0] = "O";
		Alphapetical[14][1] = "O'";
		Alphapetical[15][0] = "P";
		Alphapetical[15][1] = "P'";
		Alphapetical[16][0] = "Q";
		Alphapetical[16][1] = "Q'";
		Alphapetical[17][0] = "R";
		Alphapetical[17][1] = "R'";
		Alphapetical[18][0] = "S";
		Alphapetical[18][1] = "S'";
		Alphapetical[19][0] = "T";
		Alphapetical[19][1] = "T'";
		Alphapetical[20][0] = "U";
		Alphapetical[20][1] = "U'";
		Alphapetical[21][0] = "V";
		Alphapetical[21][1] = "V'";
		Alphapetical[22][0] = "W";
		Alphapetical[22][1] = "W'";
		Alphapetical[23][0] = "X";
		Alphapetical[23][1] = "X'";
		Alphapetical[24][0] = "Y";
		Alphapetical[24][1] = "Y'";
		Alphapetical[25][0] = "Z";
		Alphapetical[25][1] = "Z'";
	}

	public String[] printTheMintermsArray(int arrayofChosenPrimeImplicants[][], int[][] arrayOfPrimeImplicants,
			int numOfVariables) {
		String[] anser = new String[arrayofChosenPrimeImplicants.length];

		int counter = 0;
		System.out.println("The Answer:");
		System.out.println();
		String TheAnswer = new String();

		if (arrayOfPrimeImplicants[0].length == (numOfVariables + 1)
				&& arrayOfPrimeImplicants[0][numOfVariables] != 0) {
			System.out.println("1");
			return new String[] { "1" };
		} else {
			for (int i = 0; i < arrayofChosenPrimeImplicants.length; i++) {
				boolean flag111 = true;
				for (int j = 0; j < arrayofChosenPrimeImplicants[0].length; j++) {
					if (arrayofChosenPrimeImplicants[i][j] == 177) {
						flag111 = false;
						break;
					}
					int input = arrayOfPrimeImplicants[arrayofChosenPrimeImplicants[i][j]][0];

					// convert int to bits
					boolean[] bits = new boolean[numOfVariables];
					for (int k = numOfVariables - 1; k >= 0; k--) {
						bits[k] = (input & (1 << k)) != 0;
					}

					String terms[] = new String[numOfVariables];

					for (int k = 0; k < numOfVariables; k++) {
						if (bits[k] == true)
							terms[numOfVariables - k - 1] = Alphapetical[numOfVariables - k - 1][0];

						else
							terms[numOfVariables - k - 1] = Alphapetical[numOfVariables - k - 1][1];
					}

					for (int s = 0; s < numOfVariables; s++) {

						int k = 1;
						boolean flag = false;

						int dash = arrayOfPrimeImplicants[arrayofChosenPrimeImplicants[i][j]][k];
						while (dash != 0 && k < arrayOfPrimeImplicants[0].length) {

							dash = arrayOfPrimeImplicants[arrayofChosenPrimeImplicants[i][j]][k++];
							int dashindex = (int) (Math.log(dash) / Math.log(2));
							if (s == numOfVariables - dashindex - 1)
								flag = true;
						}

						if (flag == false)
							TheAnswer += terms[s];
					}

					TheAnswer += " + ";
				}
				if (flag111 == true) {
					TheAnswer = TheAnswer.substring(0, TheAnswer.length() - 1);
					TheAnswer = TheAnswer.substring(0, TheAnswer.length() - 1);
					TheAnswer = TheAnswer.substring(0, TheAnswer.length() - 1);
					System.out.println("   " + TheAnswer);
					anser[counter] = TheAnswer;
					counter++;
					TheAnswer = "";
				}
			}

			return anser;
		}
	}

}
