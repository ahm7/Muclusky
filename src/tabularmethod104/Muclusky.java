package tabularmethod104;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.plaf.FileChooserUI;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Muclusky {

	private JFrame frame;
	private JTextField minterms;
	private JTable table;
	private JTextField dcares;
	private JTextField textField_1;
	protected Object textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Muclusky window = new Muclusky();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Muclusky() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\king\\Downloads\\CSED20 Photos\\30781193011_cf7c7324bd_o.jpg"));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.PINK);
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 642, 530);
		minterms = new JTextField();
		minterms.setBounds(297, 74, 321, 34);
		frame.getContentPane().add(minterms);
		minterms.setColumns(10);

		JLabel lblNewLabel = new JLabel("put your minterms ");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(28, 77, 229, 24);
		frame.getContentPane().add(lblNewLabel);

		table = new JTable();
		table.setBounds(90, 267, -9, 43);
		frame.getContentPane().add(table);

		JLabel lblTheAnswer = new JLabel("all minimum solutions");
		lblTheAnswer.setForeground(Color.BLUE);
		lblTheAnswer.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblTheAnswer.setBounds(10, 346, 193, 64);
		frame.getContentPane().add(lblTheAnswer);

		dcares = new JTextField();
		dcares.setBounds(297, 119, 321, 34);
		frame.getContentPane().add(dcares);
		dcares.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("your don't cares");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(35, 127, 140, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel label = new JLabel("");
		label.setBounds(98, 232, 0, -79);
		frame.getContentPane().add(label);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(541, 372, -239, 19);
		frame.getContentPane().add(textArea);

		textField_1 = new JTextField();
		textField_1.setBounds(300, 21, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNumberOfVar = new JLabel("number of var");
		lblNumberOfVar.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNumberOfVar.setBounds(35, 27, 158, 14);
		frame.getContentPane().add(lblNumberOfVar);

		JTextArea textex = new JTextArea();
		textex.setBounds(225, 303, 531, 126);
		frame.getContentPane().add(textex);

		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[][] d = new int[1][4];
				part2 b = new part2();
				String mterms = minterms.getText();
				String var = textField_1.getText();
				String dcare = dcares.getText();
				String mparts[] = mterms.split(" ");
				String dparts[] = dcare.split(" ");
				int vare=0;
				if(var.length()!=0){
				 vare = Integer.parseInt(textField_1.getText());
				}
				/* added from main */
				print ahmed = new print();

				ahmed.ss();
				PrintStream o;
				try {
					o = new PrintStream(new FileOutputStream("outpu1.txt"));
					System.setOut(o);

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				mlinkedlist ss = new mlinkedlist();
				// Scanner input = new Scanner(System.in);
				LinkedList ana = new LinkedList();
				boolean fiag1 =true;
				try {
					int numberOFVariables = vare;
					ss.determineTheLengthOfTheArray((int) (Math.pow(2,numberOFVariables)- 1));
					int minterm = 0;
					int[] arr = new int[numberOFVariables + 1];

					boolean firsttime = true;
					int contera = 0;
					while (contera < mparts.length) {
						minterm = Integer.parseInt(mparts[contera]);

						if (minterm > (int) Math.pow(2,numberOFVariables) - 1) {
							textex.append("invalid input");
							fiag1=false;
							break;
						}
						arr[0] = minterm;

						if (firsttime == true || minterm == 0) {
							ss.addfirst(arr, 0, 0, false);
							firsttime = false;
						} else
							ss.add(arr, 0, 0, false);
						ana.add(minterm);

						contera++;
					}
					if(fiag1==true){
					int numOfDontCare = 0;
					int[] dontCare = new int[100];
					if (dcare.length()!= 0) {
						contera = 0;

						while (contera < dparts.length) {
							minterm = Integer.parseInt(dparts[contera]);

							if (minterm > (int) Math.pow(2,numberOFVariables) - 1) {
								textex.append("invalid input");
								fiag1=false;
								break;}
							arr[0] = minterm;

							if (minterm == 0)
								ana.add(minterm);

							else
								ss.add(arr, 0, 0, false);

							dontCare[numOfDontCare++] = minterm;
							contera++;

						}
					} else {
						numOfDontCare = 0;

					}
					if(fiag1==true){
					AllPrimeiPmlicants sss = new AllPrimeiPmlicants();

					int primeImplicantsarray[][] = sss.theAnswer(ss, (int) Math.pow(2,numberOFVariables) - 1, dontCare,
							numOfDontCare);

					 System.out.println(
								"*********************************************All prime Implicants ****************************************************");
					 for(int i = 0 ; i< primeImplicantsarray.length;i++){
						 for(int j = 0 ;j<primeImplicantsarray[0].length;j++){
							 System.out.print(primeImplicantsarray[i][j] + "  ");
						 }
						 System.out.println();
					 }
					part2 aa = new part2();
					int g[][] = aa.normal(primeImplicantsarray);
					int a7m[] = new int[ana.size()];
					for (int y = 0; y < ana.size(); y++) {
						a7m[y] = (int) ana.get(y);
					}
					int bb[][] = aa.MINIMUMFOUDER(g, a7m);
					int j=0;
					System.out.println("minimum primes ");
					for(int y=0;y<bb.length;y++){
						for( j=0;j<bb[0].length;j++){
							if(bb[y][j]!=177){
								int ghf=bb[y][j]+1;
							System.out.print("p"+ghf+" ");}
						}
						if(bb[y][j-1]!=177){
						System.out.println(" ");
					}}

					String[] h = ahmed.printTheMintermsArray(bb, primeImplicantsarray, vare);

					for (int y = 0; y < h.length; y++) {
						if(h[y]!=null){
						textex.append(h[y] + "\n");
						}
					}}}
					
					
				} catch (Exception e) {

					textex.append("invalid input");
				}

				// d[0][0]= Integer.parseInt(textField1.getText());

				// int u[][]=b.normal(d);

				// textField2.setText(Integer.toString(parts[]);

			}
		});
		btnNewButton_1.setBounds(225, 232, 175, 43);
		frame.getContentPane().add(btnNewButton_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(663, 11, -645, 418);
		frame.getContentPane().add(textArea_2);
	}
}
