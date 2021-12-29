package kis.teacher.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;

public class TeacherDashBoard {

	private JFrame teacherDashBoardFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherDashBoard window = new TeacherDashBoard();
					window.teacherDashBoardFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TeacherDashBoard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		teacherDashBoardFrame = new JFrame();
		teacherDashBoardFrame.setTitle("Teacher Dashboard");
		teacherDashBoardFrame.setBounds(100, 100, 450, 300);
		teacherDashBoardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
