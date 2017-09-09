package sadasdas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
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
	public window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewForm = new JButton("NEW FORM");
		btnNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame o = new aa();
			}
		});
		btnNewForm.setBounds(85, 41, 114, 91);
		contentPane.add(btnNewForm);
		
		JButton btnDsplayForms = new JButton("DISPLAY FORMS");
		btnDsplayForms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (from f : M.xx) {
						JFrame c = new display(f);
				}
			}
		});
		btnDsplayForms.setBounds(246, 41, 111, 91);
		contentPane.add(btnDsplayForms);
		
		setVisible(true);
	}

}
