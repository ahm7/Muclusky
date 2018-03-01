package tabularmethod104;

public class part2 {

	public int[][] MINIMUMFOUDER(int[][] a, int p[]) {
		int[] o = new int[p.length];
		int i = 0;
		int j = 0;
		int y = 0;
		int k = 0;
		int l = 0;
		int yom = 0;
		int counter = 0;
		int contera = 0;
		int magic=0;
		int gg=0;
		int wow=0;
		int[][]primona=new int[10][20];
		
		int po=0;
		linkedlist primo = new linkedlist();
	int [][]ddd=a;
		// first check if there is a minterm cover with only one prime
		while (i < p.length) {
			for (y = 0; y < a.length; y++) {
				for (j = 0; j < a[0].length; j++) {
					if (a[y][j] == p[i]) {
						yom = y;
						k++;
					}
				}
				if (k == 2) {
					k = 0;
					break;
				}

			}
			// if it essential delet it and rows coloumns
			if (k == 1) {
				primona[0][po]=yom;
				po++;
				counter = 0;
				while (counter < a[0].length) {
					for (y = 0; y < a.length; y++) {
						for (j = 0; j < a[0].length; j++) {
							if (a[y][j] == a[yom][counter] && y != yom) {
								a[y][j] = 177;
							}

						}
					}
					counter++;
				}

				for (y = 0; y < a[0].length; y++) {
					a[yom][y] = 177;
				}
				o[l] = yom;
				l++;

			}
			k = 0;
			i++;

		}
magic=po;
		counter = 0;

		int hhh = 0;
		int maxprime = 0;
		int yom2[] = new int[20];
		// find rest minterns not cover with essential prime implicants
		for (y = 0; y < a.length; y++) {
			for (j = 0; j < a[0].length; j++) {
				if (a[y][j] != 177) {
					for (int g = 0; g < 20; g++) {
						if (y == 0 && j == 0 && a[y][j] == 0) {
							hhh = 0;
						} else {
							if (a[y][j] == yom2[g]) {
								hhh = 10;
								break;
							}
						}

					}
					if (hhh != 10) {
						for(int ut=0;ut<p.length;ut++){
							if(a[y][j]==p[ut]){	
						yom2[contera] = a[y][j];
						contera++;
						break;
					}}}
					hhh = 0;
				}

			}
		}
		
		int b = 0;
		int v = 0;
		int c = 0;
		int x = 0;
		int z = 0;
		counter = 0;
		// check all probabilities
		if(contera==1){
			for (y = 0; y < a.length; y++) {
				for (j = 0; j < a[0].length; j++) {
				if(a[y][j]==yom2[0]){
					primona[0][po]=y;
				}
				}				}
		}
		if(contera!=0 && contera != 1){
		while (z < contera) {
			int ah7[][] = new int[5][1];
			x = 0;
			for (y = 0; y < a.length; y++) {
				for (j = 0; j < a[0].length; j++) {
					if (a[y][j] == yom2[z]) {
						ah7[x][0] = y + 1;
						x++;
					}

				}
			}
			int ah8[][] = new int[x][1];
			for (b = 0; b < x; b++) {
				for (v = 0; v < 1; v++) {
					ah8[b][v] = ah7[b][v];
				}
			}
			primo.add(ah8);
			z++;
		}

		int ah7[][] = primo.get(0);
	

		linkedlist prinmo2 = new linkedlist();
int fo=0;
 y=0;
		while(y<=contera){
			
			int[][]s1=primo.get(y);

		if(y<contera-1){
			int t=0;
		int [][]s2=primo.get(y+1);
		int h=s1.length*s2.length;
		int [][]sum=new int [h][2];
		int row=0;
		
		for(v=0;v<s1.length;v++){
			for(b=0;b<s1[0].length;b++){
				for(j=0;j<s2.length;j++){
					if(s1[v][b]==0){
						break;
					}
					sum[row][t]=s1[v][b];
				row++;
				}
				
				t++;
				
			}
			t=0;
		}
	row=0;
	int r=1;
		for(int u=0;u<s1.length;u++){
			
			for(v=0;v<s2.length;v++){
				for(b=0;b<s2[0].length;b++){	
					if(s2[v][b]==0){
						break;
					}
					sum[row][r]=s2[v][b];
					
					row++;
				}
				
			
		}
			r=1;
		}
		
		
		
		
		prinmo2.add(sum);
		
		}else{
			prinmo2.add(s1);
		}
		y=y+2;
		}
		 y=0;
		
		int ds[][]=prinmo2.get(1);
		
		int conter=0;
		y=0;
		while(prinmo2.get(y)!=null){
			y++;
			conter++;
		}
		
		y=0;
		while(y<conter-1){
			int [][]s1=prinmo2.get(0);
			int [][]s2=prinmo2.get(1);
			   prinmo2.remove();
		        prinmo2.remove();
		       
		        
			int h=s1.length*s2.length;
			int [][]sum=new int [h][200];
			int row=0;
			int t=0;
			int maximo=0;
			for(v=0;v<s1[0].length;v++){
				for(b=0;b<s1.length;b++){
					for(j=0;j<s2.length;j++){
					sum[row][t]=s1[b][v];
					row++;
					
					}
					
				}
				t++;
				if(t>maximo){
					maximo=t;
				}
				row=0;
			}
			
			
		row=0;
		int r=maximo;
			for(int u=0;u<s1.length;u++){
				
				for(v=0;v<s2.length;v++){
					for(b=0;b<s2[0].length;b++){
						
						sum[row][r]=s2[v][b];
						r++;
					}
					row++;

				
			}
				r=maximo;
			}
			 counter=0;
			 int max=0;
			for (x = 0; x < sum.length; x++) {
				for (j = 0; j < sum[0].length; j++) {
				
					if(sum[x][j]!=0){
						counter++;
					}}
				max=counter;
				counter=0;
			}
			int [][]sum2=new int[sum.length][max];
			 v=0;
			for (x = 0; x < sum.length; x++) {
				for (j = 0; j <sum[0].length; j++) {
					if(sum[x][j]!=0){
					sum2[x][v]=sum[x][j];
					v++;
}
					}
				v=0;
				
			}
			
			prinmo2.add(0,sum2);
		y++;
		
		}
		int min=100;
		int minform=0;
		counter=0;
		int finalsum[][]=prinmo2.get(0);
		int check[]=new int [finalsum[0].length];
		for(y=0;y<finalsum.length;y++){
			for(j=0;j<finalsum[0].length;j++){
			check[j]=finalsum[y][j];
			}
			for(j=0;j<finalsum[0].length;j++){
				for(x=j+1;x<finalsum[0].length;x++){
					if(check[j]==finalsum[y][x]){
						check[j]=177;
					}
				}}
			for(j=0;j<finalsum[0].length;j++){
				if(check[j]!=177){
					counter++;
				}}
			if(counter<min){
				min=counter;
			}
			counter=0;
			
		}
		int[][]mino=new int[10][min];
		 wow=-1;
		int woweno=0;
		counter=0;
		for(y=0;y<finalsum.length;y++){
			for(j=0;j<finalsum[0].length;j++){
			check[j]=finalsum[y][j];
			}
			for(j=0;j<finalsum[0].length;j++){
				for(x=j+1;x<finalsum[0].length;x++){
					if(check[j]==finalsum[y][x]){
						check[j]=177;
					}
				}}
			for(j=0;j<finalsum[0].length;j++){
				if(check[j]!=177){
					counter++;
				}}
			if(counter==min){
				 woweno=0;
wow++;



				for(j=0;j<finalsum[0].length;j++){
					if(check[j]!=177){
					mino[wow][woweno]=check[j]-1;
					woweno++;
					
				}}
			}
			counter=0;
			
		}
		
		for(y=1;y<wow+1;y++){
			for(j=0;j<primona[0].length;j++){
				
			primona[y][j]=primona[0][j];
			}
		}
		 gg=po;
		for(y=0;y<mino.length;y++){
			gg=po;
			for(j=0;j<mino[0].length;j++){
				primona[y][gg]=mino[y][j];
				gg++;
			}
		}
		
		
		}else{
			int[][] purch=new int[1][po];
			for(y=0;y<po;y++){
				purch[0][y]=primona[0][y];
			}
			return purch;
		}
		int [][]finalo=new int[wow+1][gg];
		for(int ss=0;ss<wow+1;ss++){
			for(int jgj=0;jgj<gg;jgj++){
				finalo[ss][jgj]=primona[ss][jgj];
			}
		}
		
		counter=0;
		for(y=0;y<finalo.length-1;y++){
			for(x=y+1;x<finalo.length;x++){
			counter=0;
			for(j=0;j<finalo[0].length;j++){
					if(finalo[y][j]==finalo[x][j]){
						counter++;}else{
							counter=0;
							break;}
						if(counter==finalo[0].length){
							for(j=0;j<counter;j++){
								finalo[x][j]=177;
							}
					}
				
			}
		}}
		
		
		return finalo;
	}
	
	
	public int [][]normal(int[][]r){
		double i=java.lang.Math.pow(2,(r[0].length-1));
		int u=(int)i;
		int [][]tr=new int[r.length][u];
		int x=0;
		int y=0;
		int z=0;
		int q=1;
		int j=0;
		int l=0;
		int h=0;
		int d=0;
		int counter=0;
		int [][]qw=new int [1][u];
		
		for(x=0;x<r.length;x++){
			q=0;
			for(z=0;z<u;z++){
				counter=0;
				for(y=1;y<r[0].length;y++){
					double ii=java.lang.Math.pow(2,y-1);
					int uu=(int)ii;
					d=uu&z;
					if(d>0){
						counter=r[x][y]+counter;
					}
					
				}
				tr[x][q]=counter;
				q++;
				
			}
			for(y=0;y<u;y++){
	tr[x][y]=tr[x][y]+r[x][0];
}
			
		}
		
		for(y=0;y<tr.length;y++){

			for(x=0;x<tr[0].length-1;x++){
				for(z=x+1;z<tr[0].length;z++){
					if(tr[y][x]==tr[y][z]){
						tr[y][z]=177;
					}
				}
				
			}
		}
		
		
		return tr;

	}

	
	
	
	
}