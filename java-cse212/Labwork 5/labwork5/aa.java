package sadasdas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aa extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtSurname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aa frame = new aa();
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
	public aa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setText("NAME");
		txtName.setBounds(252, 29, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JCheckBox chckbxBook = new JCheckBox("BOOK");
		chckbxBook.setBounds(113, 192, 97, 23);
		contentPane.add(chckbxBook);
		
		JCheckBox chckbxSports = new JCheckBox("SPORTS");
		chckbxSports.setBounds(217, 192, 97, 23);
		contentPane.add(chckbxSports);
		
		JCheckBox chckbxCinema = new JCheckBox("C\u0130NEMA");
		chckbxCinema.setBounds(308, 192, 92, 23);
		contentPane.add(chckbxCinema);
		
		JCheckBox chckbxArts = new JCheckBox("ARTS");
		chckbxArts.setBounds(418, 192, 97, 23);
		contentPane.add(chckbxArts);
		
		txtSurname = new JTextField();
		txtSurname.setText("SURNAME");
		txtSurname.setBounds(252, 60, 86, 20);
		contentPane.add(txtSurname);
		txtSurname.setColumns(10);
		
		JRadioButton rdbtnMarried = new JRadioButton("MARR\u0130ED");
		rdbtnMarried.setBounds(252, 114, 109, 23);
		contentPane.add(rdbtnMarried);
		
		JRadioButton rdbtnDivorced = new JRadioButton("D\u0130VORCED");
		rdbtnDivorced.setBounds(379, 114, 109, 23);
		contentPane.add(rdbtnDivorced);
		
		JRadioButton rdbtnSingle = new JRadioButton("S\u0130NGLE");
		rdbtnSingle.setBounds(134, 114, 109, 23);
		contentPane.add(rdbtnSingle);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				from q = new from();
				q.name = txtName.getText();
				q.surname = txtSurname.getText();
				q.arts = chckbxArts.isSelected();
				q.cinema = chckbxCinema.isSelected();
				q.sports = chckbxSports.isSelected();
				q.book = chckbxBook.isSelected();
				q.married = rdbtnMarried.isSelected();
				q.single = rdbtnSingle.isSelected();
				q.divorced = rdbtnDivorced.isSelected();
				M.xx.add(q);
				dispose();	
			}
		});
		btnSave.setBounds(154, 298, 109, 52);
		contentPane.add(btnSave);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(303, 299, 109, 51);
		contentPane.add(btnCancel);
		setVisible(true);
	}
}
