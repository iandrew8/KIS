package kis.teacher.gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AllStudents {

	private JFrame allStudentsFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllStudents window = new AllStudents();
					window.allStudentsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AllStudents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		allStudentsFrame = new JFrame();
		allStudentsFrame.setTitle("All Students");
		allStudentsFrame.setBounds(100, 100, 450, 300);
		allStudentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
