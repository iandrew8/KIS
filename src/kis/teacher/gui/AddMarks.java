package kis.teacher.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import kis.databaseservices.RecordMarksHandler;
import kis.databaseservices.StudentRegistrationHandler;
import kis.student.gui.Student;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddMarks {

	private JFrame frmAddStudentMarks;
	private JTextField studentNameTextField;
	private JTextField marksTextField;
	private JTextField registrationNumberTextField;

	private void Reset() {
		studentNameTextField.setText("");
		registrationNumberTextField.setText("");
		marksTextField.setText("");
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMarks window = new AddMarks();
					window.frmAddStudentMarks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentMarks = new JFrame();
		frmAddStudentMarks.setTitle("Add Student Marks");
		frmAddStudentMarks.setBounds(100, 100, 450, 300);
		frmAddStudentMarks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentMarks.getContentPane().setLayout(null);
		
		JLabel lblAddStudentMarks = new JLabel("Add Student Marks");
		lblAddStudentMarks.setBounds(143, 12, 146, 15);
		frmAddStudentMarks.getContentPane().add(lblAddStudentMarks);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setBounds(12, 52, 110, 15);
		frmAddStudentMarks.getContentPane().add(lblStudentName);
		
		studentNameTextField = new JTextField();
		studentNameTextField.setBounds(231, 50, 114, 19);
		frmAddStudentMarks.getContentPane().add(studentNameTextField);
		studentNameTextField.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(12, 130, 70, 15);
		frmAddStudentMarks.getContentPane().add(lblSubject);
		
		String[] subjectArray = {"", "sst","maths","Science","English"};
		JComboBox subjectComboBox = new JComboBox(subjectArray);
		subjectComboBox.setBounds(231, 125, 114, 24);
		frmAddStudentMarks.getContentPane().add(subjectComboBox);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setBounds(12, 180, 70, 15);
		frmAddStudentMarks.getContentPane().add(lblMarks);
		
		marksTextField = new JTextField();
		marksTextField.setBounds(231, 178, 114, 19);
		frmAddStudentMarks.getContentPane().add(marksTextField);
		marksTextField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String studentName = studentNameTextField.getText().toString();
				String registrationNumber = registrationNumberTextField.getText().toString();
				String subject = String.valueOf(subjectComboBox.getSelectedItem());
				String score = marksTextField.getText().toString();
				int parsedScore = Integer.parseInt(score);
				
				Score studentScore = new Score(studentName, registrationNumber,subject, parsedScore
						);
				RecordMarksHandler handler = new RecordMarksHandler();
				
				boolean res = handler.recordStudentMarks(studentScore);
				
				if (java.util.Objects.equals(res, true)) {
					JOptionPane.showMessageDialog(null,
							"Student " + studentName + " with " + parsedScore + " added successfully");
					Reset();
				} else {
					JOptionPane.showMessageDialog(null, "Oops, unable to add marks! for" + studentName);
				}
			}
			
		});
		btnSave.setBounds(12, 222, 117, 25);
		frmAddStudentMarks.getContentPane().add(btnSave);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setBounds(12, 93, 153, 15);
		frmAddStudentMarks.getContentPane().add(lblRegistrationNumber);
		
		registrationNumberTextField = new JTextField();
		registrationNumberTextField.setBounds(231, 91, 114, 19);
		frmAddStudentMarks.getContentPane().add(registrationNumberTextField);
		registrationNumberTextField.setColumns(10);
	}

}
