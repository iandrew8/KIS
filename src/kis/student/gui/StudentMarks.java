package kis.student.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class StudentMarks extends JFrame{

	private JFrame frmStudentmarks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frmStudentmarks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentmarks = new JFrame();
		frmStudentmarks.setTitle("StudentMarks");
		frmStudentmarks.setBounds(100, 100, 450, 300);
		frmStudentmarks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
