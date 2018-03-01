package tabularmethod104;
import java.util.Scanner;
import java.lang.Math;
public class part2main {

	public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		int[][] n=new int[3][4];
		int []o=new int[4];
		
	for(int i=0;i<o.length;i++){
		o[i]= in.nextInt();

	}
	
		
		

		for(int y=0;y<n.length;y++){
			for(int x=0;x<n[0].length;x++){
				n[y][x]= in.nextInt();
						
				
			}
		}

		
		
	part2 a = new part2();
	
	
	int [][]b=a.MINIMUMFOUDER(n,o);
for(int y=0;y<b.length;y++){
	for(int x=0;x<b[0].length;x++){
		System.out.print(b[y][x]+" ");
	}
	System.out.println(" ");
	}
	
	 /*
	int[][]e=new int[3][4];
		part2 b = new part2();
		for(int y=0;y<3;y++){
			for(int x=0;x<4;x++){
				e[y][x]= in.nextInt();
						
				
			}
		}
int u[][]=b.normal(e);
for(int y=0;y<u.length;y++){
	for(int x=0;x<u[0].length;x++){
		System.out.print(u[y][x]+" ");
	}
	System.out.println(" ");
	}
	*/
	}
	
	
}
