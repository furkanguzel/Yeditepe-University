package sadasdas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class display extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					display frame = new display(null);
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
	
	public display(from q) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(76, 82, 111, 14);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("SURNAME");
		lblSurname.setBounds(235, 82, 140, 14);
		contentPane.add(lblSurname);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setBounds(146, 117, 140, 14);
		contentPane.add(lblStatus);
		
		JLabel lblHobbies = new JLabel("HOBB\u0130ES");
		lblHobbies.setBounds(65, 142, 271, 14);
		contentPane.add(lblHobbies);
		lblName.setText(q.name);
		lblSurname.setText(q.surname);
		lblStatus.setText(q.single?"single":q.married?"married":"divorced");
		lblHobbies.setText((q.arts?"arts":" ") + (q.book?" book":" ")+(q.cinema?" cinema":" ")+(q.sports?" sports":" "));
		setVisible(true);
		
	}
}
