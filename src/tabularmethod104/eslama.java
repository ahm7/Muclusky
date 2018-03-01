package tabularmethod104;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class eslama extends JFrame {

	private JPanel contentPane;
	private JTextField txtEslamShfdhflhdlfhdlhfldhfld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eslama frame = new eslama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public eslama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtEslamShfdhflhdlfhdlhfldhfld = new JTextField();
		txtEslamShfdhflhdlfhdlhfldhfld.setText("eslam shfdhflhdlfhdlhfldhfld");
		contentPane.add(txtEslamShfdhflhdlfhdlhfldhfld, BorderLayout.CENTER);
		txtEslamShfdhflhdlfhdlhfldhfld.setColumns(10);
	}

}
