package tabularmethod104;
import java.util.Scanner;

import javax.swing.JFileChooser; 
public class openfile {

	JFileChooser filechooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();
	StringBuilder sd = new StringBuilder();
	StringBuilder sf = new StringBuilder();

	public void pickme() throws Exception{
		
		
		if(filechooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
			
			java.io.File file = filechooser.getSelectedFile();
			Scanner input = new Scanner(file);
			sb.append(input.nextLine());
			sd.append(input.nextLine());
			sf.append(input.nextLine());

		}
		else{
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
