package kis.student.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class StudentHome extends JFrame{

	private JFrame frmStudentHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentHome window = new StudentHome();
					window.frmStudentHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentHome = new JFrame();
		frmStudentHome.setTitle("Student Home");
		frmStudentHome.setBounds(100, 100, 450, 300);
		frmStudentHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
