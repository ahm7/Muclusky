package tabularmethod104;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

		// trace how minterms are distributed in the linked list
		
		/*--------------------------------------------------------print test---------------------------------------------------------------------------*/
		
		/*int arr[][] = new int[9][3];
		
		arr[0][0] = 2;
		arr[0][1] = 4;
		arr[0][2] = 0;		
		arr[1][0] = 1;
		arr[1][1] = 8;
		arr[1][2] = 4;
		arr[2][0] = 1;
		arr[2][1] = 16;
		arr[2][2] = 8;
		arr[3][0] = 4;
		arr[3][1] = 2;
		arr[3][2] = 1;
		arr[4][0] = 4;
		arr[4][1] = 8;
		arr[4][2] = 1;
		arr[5][0] = 4;
		arr[5][1] = 16;
		arr[5][2] = 2;
		arr[6][0] = 4;
		arr[6][1] = 16;
		arr[6][2] = 8;
		arr[7][0] = 5;
		arr[7][1] = 8;
		arr[7][2] = 2;
		arr[8][0] = 20;
		arr[8][1] = 8;
		arr[8][2] = 2;


		int arrchoosen[][] = new int[2][5];
		
		arrchoosen[0][0] = 0;
		arrchoosen[0][1] = 7;
		arrchoosen[0][2] = 2;
		arrchoosen[0][3] = 8;
		arrchoosen[0][4] = 6;
		arrchoosen[1][0] = 0;
		arrchoosen[1][1] = 7;
		arrchoosen[1][2] = 2;
		arrchoosen[1][3] = 8;
		arrchoosen[1][4] = 4;
		*/


		
		
		

		/*----------------------------------------------------------------test 1--------------------------------------------------------------------*/

		/*
		  ss.determineTheLengthOfTheArray(15);
		  int arraysizeforTheVAlue = (int)Math.ceil((Math.log(15) / Math.log(2))) + 1;
		  int[]arr = new int[arraysizeforTheVAlue]; 
		  arr[0] = 0;
		  ss.addfirst(arr, 0, 0, false);
		  arr[0] = 1; 
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 2; 
		  ss.add(arr, 0, 0,false); 
		  arr[0] = 8; 
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 5; ss.add(arr,0, 0, false); 
		  arr[0] = 6; 
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 9;
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 10; 
		  ss.add(arr, 0, 0, false);
		  arr[0] = 7; 
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 14; 
		  ss.add(arr, 0, 0,false); 
		  AllPrimeiPmlicants sss = new AllPrimeiPmlicants();
		  int[] dontCare = new int[100];
		  int num = 0;
		  int s[][] = sss.theAnswer(ss, 15,dontCare,num); System.out.println(
		  "*********************************************All prime Implicants ****************************************************"
		  ); sss.primeImplicants.printlast();
		*/
		
		
		/*----------------------------------------------------------------test 2--------------------------------------------------------------------*/

		/*
		  ss.determineTheLengthOfTheArray(15);
		  int arraysizeforTheVAlue = (int)Math.ceil((Math.log(15) / Math.log(2))) + 1;
		  int[]arr = new int[arraysizeforTheVAlue];
		  arr[0] = 1;
		  ss.addfirst(arr, 0, 0, false);
		  arr[0] = 2; 
		  ss.add(arr, 0, 0, false);
		  arr[0] = 3;
		  ss.add(arr, 0, 0,false);
		  arr[0] = 9;
		  ss.add(arr, 0, 0, false);
		  arr[0] = 10;
		  ss.add(arr, 0, 0, false);
		  arr[0] = 7;
		  ss.add(arr, 0, 0, false);
		  arr[0] = 11;
		  ss.add(arr, 0, 0, false); 
		  arr[0] = 13;
		  ss.add(arr, 0, 0,false);
		  arr[0] = 15; ss.add(arr, 0, 0, false); 
		  AllPrimeiPmlicants sss= new AllPrimeiPmlicants(); 	
		  int[] dontCare = new int[100];
		  int num = 0;
		  int s[][] = sss.theAnswer(ss, 15,dontCare,num);
		  System.out.println(
		  "*********************************************All prime Implicants ****************************************************"
		  ); sss.primeImplicants.printlast();
		 */

		/*----------------------------------------------------------------test 3--------------------------------------------------------------------*/
		/*
		  ss.determineTheLengthOfTheArray(7);
		  int arraysizeforTheVAlue = (int)Math.ceil((Math.log(7) / Math.log(2))) + 1; 
		  int[]arr = new int[arraysizeforTheVAlue];
		  arr[0] = 0;
		  ss.addfirst(arr, 0, 0, false);		  
		  arr[0] = 1; 
		  ss.add(arr, 0, 0, false);
		  arr[0] = 2;
		  ss.add(arr, 0, 0,false);
		  arr[0] = 5;
		  ss.add(arr, 0, 0, false);
		  arr[0] = 6;
		  ss.add(arr,0, 0, false);
		  arr[0] = 7;
		  ss.add(arr, 0, 0, false);
		  
		  AllPrimeiPmlicants sss = new AllPrimeiPmlicants();
	      int[] dontCare = new int[100];
		  int num = 0;
		  int s[][] = sss.theAnswer(ss, 7,dontCare,num);
		  
		  for(int i = 0 ; i< s.length;i++){
			for(int j = 0 ;j<s[0].length;j++){
				 System.out.print(s[i][j] + "  ");
			}
			System.out.println();
		}
		 */

		/*--------------------------------------------------------test 4-----------------------------------------------------*/
		/*ss.determineTheLengthOfTheArray(32);
		int arraysizeforTheVAlue = (int) Math.ceil((Math.log(32) / Math.log(2))) + 1;
		int[] arr = new int[arraysizeforTheVAlue];
		arr[0] = 0;
		ss.add(arr, 0, 0, false);
		arr[0] = 2;
		ss.add(arr, 0, 0, false);
		arr[0] = 16;
		ss.add(arr, 0, 0, false);
		arr[0] = 3;
		ss.add(arr, 0, 0, false);
		arr[0] = 5;
		ss.add(arr, 0, 0, false);
		arr[0] = 9;
		ss.add(arr, 0, 0, false);
		arr[0] = 18;
		ss.add(arr, 0, 0, false);
		arr[0] = 24;
		ss.add(arr, 0, 0, false);
		arr[0] = 7;
		ss.add(arr, 0, 0, false);
		arr[0] = 11;
		ss.add(arr, 0, 0, false);
		arr[0] = 13;
		ss.add(arr, 0, 0, false);
		arr[0] = 14;
		ss.add(arr, 0, 0, false);
		arr[0] = 26;
		ss.add(arr, 0, 0, false);
		arr[0] = 28;
		ss.add(arr, 0, 0, false);
		arr[0] = 30;
		ss.add(arr, 0, 0, false);
		AllPrimeiPmlicants sss = new AllPrimeiPmlicants();
		 int[] dontCare = new int[100];
		 int num = 0;
		 int s[][] = sss.theAnswer(ss, 31,dontCare,num);
		 
		 for(int i = 0 ; i< s.length;i++){
			 for(int j = 0 ;j<s[0].length;j++){
				 System.out.print(s[i][j] + "  ");
			 }
			 System.out.println();
		 }
		System.out.println(
				"*********************************************All prime Implicants ****************************************************");
		sss.primeImplicants.printlast();
		
		*/
		
		/*--------------------------------------------------------test 5 don't care ---------------------------------------------------------------------->*/
		
		/*.determineTheLengthOfTheArray(31);
		int arraysizeforTheVAlue = (int) Math.ceil((Math.log(32) / Math.log(2))) + 1;
		int[] arr = new int[arraysizeforTheVAlue];
		arr[0] = 1;
		ss.addfirst(arr, 0, 0, false);
		arr[0] = 2;
		ss.add(arr, 0, 0, false);
		arr[0] = 4;
		ss.add(arr, 0, 0, false);
		arr[0] = 5;
		ss.add(arr, 0, 0, false);
		arr[0] = 6;
		ss.add(arr, 0, 0, false);
		arr[0] = 7;
		ss.add(arr, 0, 0, false);
		arr[0] = 9;
		ss.add(arr, 0, 0, false);
		arr[0] = 12;
		ss.add(arr, 0, 0, false);
		arr[0] = 13;
		ss.add(arr, 0, 0, false);
		arr[0] = 15;
		ss.add(arr, 0, 0, false);
		arr[0] = 17;
		ss.add(arr, 0, 0, false);
		arr[0] = 20;
		ss.add(arr, 0, 0, false);
		arr[0] = 22;
		ss.add(arr, 0, 0, false);
		arr[0] = 25;
		ss.add(arr, 0, 0, false);
		arr[0] = 28;
		ss.add(arr, 0, 0, false);
		arr[0] = 30;
		ss.add(arr, 0, 0, false);
		AllPrimeiPmlicants sss = new AllPrimeiPmlicants();
		 int[] dontCare = new int[1];
		 dontCare[0] = 10;
		 int num = 0;
		 int s[][] = sss.theAnswer(ss, 31,dontCare,num);
		 
		/* for(int i = 0 ; i< s.length;i++){
			 for(int j = 0 ;j<s[0].length;j++){
				 System.out.print(s[i][j] + "  ");
			 }
			 System.out.println();
		 }*/


		
		
		/*--------------------------------------------------------main----------------------------------------------------------------------------*/
		print ahmed =new print();

	     ahmed.ss();

			mlinkedlist ss = new mlinkedlist();
		System.out.println("please enter number of variables");
		Scanner input = new Scanner(System.in);
		LinkedList ana=new LinkedList();
		//try {
			int numberOFVariables = input.nextInt();
			ss.determineTheLengthOfTheArray((int) (Math.pow(2,numberOFVariables)-1));
			int minterm = 0;
			int[] arr = new int[numberOFVariables + 1];

			System.out.println("please enter minterms one by one ");
			System.out.println("enter -1 to finish ");
			boolean firsttime = true;
			minterm = input.nextInt();
			while (minterm != -1) {
				if (minterm > (int) Math.pow(2,numberOFVariables)-1) {
					System.out.println("invalid input  ");
					System.exit(0);
				}
				arr[0] = minterm;
				
				if(firsttime == true || minterm ==0){
					ss.addfirst(arr, 0, 0, false);
					firsttime =false;
				}
				else
					ss.add(arr, 0, 0, false);
				ana.add(minterm);

				minterm = input.nextInt();
			}

			int[] dontCare = new int[100];
			System.out.println("please enter dont care one by one ");
			System.out.println("enter -1 to finish ");
			
			minterm = input.nextInt();
			int numOfDontCare = 0;
			while (minterm != -1) {
				if (minterm > (int) Math.pow(2,numberOFVariables) - 1) {
					System.out.println("invalid input");
					System.exit(0);
				}
				arr[0] = minterm;
				
				if(minterm == 0)
				ana.add(minterm);

				else
					ss.add(arr, 0, 0, false);
				
				dontCare[numOfDontCare++] = minterm;
				minterm = input.nextInt();
			}

			AllPrimeiPmlicants sss = new AllPrimeiPmlicants();
			
			 int primeImplicantsarray[][] = sss.theAnswer(ss, (int) Math.pow(2,numberOFVariables) - 1,dontCare, numOfDontCare);
			 System.out.println(
						"*********************************************All prime Implicants ****************************************************");
			 for(int i = 0 ; i< primeImplicantsarray.length;i++){
				 for(int j = 0 ;j<primeImplicantsarray[0].length;j++){
					 System.out.print(primeImplicantsarray[i][j] + "  ");
				 }
				 System.out.println();
			 }
			 
			
			 part2 aa=new part2();
			 int g[][]=aa.normal(primeImplicantsarray);
				int a7m[]=new int[ana.size()];
				

			
						for(int y=0;y<ana.size();y++){
							a7m[y]= (int)ana.get(y);
						}
	int b[][]=aa.MINIMUMFOUDER(g,a7m);
	int j=0;
	System.out.println("minimum primes ");
	for(int y=0;y<b.length;y++){
		for( j=0;j<b[0].length;j++){
			if(b[y][j]!=177){
			System.out.print("p"+b[y][j]+" ");}
		}
		if(b[y][j-1]!=177){
		System.out.println(" ");
	}}
			
		String[]h=ahmed.printTheMintermsArray(b,primeImplicantsarray,numberOFVariables);

		//} 
			/*catch (Exception e) {

			System.out.println("invalid input1");
		}*/
		
		

		
	}

}
