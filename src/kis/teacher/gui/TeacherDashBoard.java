package kis.teacher.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JProgressBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JSplitPane;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;

import javax.swing.JTextField;

public class TeacherDashBoard {

	private JFrame teacherDashBoardFrame;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField registrationNumberTextField;
	private JTextField ageTextField;
	private JTextField textField;

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
		teacherDashBoardFrame.setBounds(100, 100, 494, 392);
		teacherDashBoardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		teacherDashBoardFrame.getContentPane().setLayout(springLayout);
		
		JLabel lblRegisterStudents = new JLabel("Register Students");
		springLayout.putConstraint(SpringLayout.NORTH, lblRegisterStudents, 10, SpringLayout.NORTH, teacherDashBoardFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblRegisterStudents, 35, SpringLayout.WEST, teacherDashBoardFrame.getContentPane());
		teacherDashBoardFrame.getContentPane().add(lblRegisterStudents);
		
		JLabel lblFirstName = new JLabel("First Name");
		springLayout.putConstraint(SpringLayout.NORTH, lblFirstName, 18, SpringLayout.SOUTH, lblRegisterStudents);
		springLayout.putConstraint(SpringLayout.WEST, lblFirstName, 10, SpringLayout.WEST, teacherDashBoardFrame.getContentPane());
		teacherDashBoardFrame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		springLayout.putConstraint(SpringLayout.NORTH, lblLastName, 16, SpringLayout.SOUTH, lblFirstName);
		springLayout.putConstraint(SpringLayout.WEST, lblLastName, 0, SpringLayout.WEST, lblFirstName);
		teacherDashBoardFrame.getContentPane().add(lblLastName);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		springLayout.putConstraint(SpringLayout.NORTH, lblRegistrationNumber, 11, SpringLayout.SOUTH, lblLastName);
		springLayout.putConstraint(SpringLayout.WEST, lblRegistrationNumber, 0, SpringLayout.WEST, lblFirstName);
		teacherDashBoardFrame.getContentPane().add(lblRegistrationNumber);
		
		JLabel lblGender = new JLabel("Gender");
		springLayout.putConstraint(SpringLayout.WEST, lblGender, 11, SpringLayout.WEST, teacherDashBoardFrame.getContentPane());
		teacherDashBoardFrame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("Age");
		springLayout.putConstraint(SpringLayout.WEST, lblAge, 0, SpringLayout.WEST, lblFirstName);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAge, -125, SpringLayout.SOUTH, teacherDashBoardFrame.getContentPane());
		teacherDashBoardFrame.getContentPane().add(lblAge);
		
		JLabel lblClass = new JLabel("Class");
		springLayout.putConstraint(SpringLayout.NORTH, lblClass, 21, SpringLayout.SOUTH, lblGender);
		springLayout.putConstraint(SpringLayout.WEST, lblClass, 0, SpringLayout.WEST, lblFirstName);
		teacherDashBoardFrame.getContentPane().add(lblClass);
		
		JLabel lblSubject = new JLabel("Subject");
		springLayout.putConstraint(SpringLayout.SOUTH, lblSubject, -60, SpringLayout.SOUTH, teacherDashBoardFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblSubject, 0, SpringLayout.EAST, lblGender);
		teacherDashBoardFrame.getContentPane().add(lblSubject);
		
		JLabel lblDate = new JLabel("Date (DD:MM:YY)");
		springLayout.putConstraint(SpringLayout.WEST, lblDate, 10, SpringLayout.WEST, teacherDashBoardFrame.getContentPane());
		teacherDashBoardFrame.getContentPane().add(lblDate);
		
		firstNameTextField = new JTextField();
		firstNameTextField.setToolTipText("first name");
		springLayout.putConstraint(SpringLayout.WEST, firstNameTextField, 85, SpringLayout.EAST, lblFirstName);
		springLayout.putConstraint(SpringLayout.SOUTH, firstNameTextField, 0, SpringLayout.SOUTH, lblFirstName);
		teacherDashBoardFrame.getContentPane().add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		lastNameTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, lastNameTextField, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.SOUTH, lastNameTextField, 0, SpringLayout.SOUTH, lblLastName);
		lastNameTextField.setColumns(10);
		teacherDashBoardFrame.getContentPane().add(lastNameTextField);
		
		registrationNumberTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, registrationNumberTextField, 0, SpringLayout.NORTH, lblRegistrationNumber);
		springLayout.putConstraint(SpringLayout.EAST, registrationNumberTextField, 0, SpringLayout.EAST, firstNameTextField);
		teacherDashBoardFrame.getContentPane().add(registrationNumberTextField);
		registrationNumberTextField.setColumns(10);
		
		JComboBox genderComboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, lblGender, 5, SpringLayout.NORTH, genderComboBox);
		springLayout.putConstraint(SpringLayout.NORTH, genderComboBox, 19, SpringLayout.SOUTH, registrationNumberTextField);
		springLayout.putConstraint(SpringLayout.WEST, genderComboBox, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, genderComboBox, 0, SpringLayout.EAST, firstNameTextField);
		teacherDashBoardFrame.getContentPane().add(genderComboBox);
		
		ageTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, ageTextField, -125, SpringLayout.SOUTH, teacherDashBoardFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, ageTextField, 0, SpringLayout.EAST, firstNameTextField);
		ageTextField.setColumns(10);
		teacherDashBoardFrame.getContentPane().add(ageTextField);
		
		JComboBox classComboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, classComboBox, -5, SpringLayout.NORTH, lblClass);
		springLayout.putConstraint(SpringLayout.WEST, classComboBox, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, classComboBox, 0, SpringLayout.EAST, firstNameTextField);
		teacherDashBoardFrame.getContentPane().add(classComboBox);
		
		JComboBox subjectComboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.WEST, subjectComboBox, 0, SpringLayout.WEST, firstNameTextField);
		springLayout.putConstraint(SpringLayout.EAST, subjectComboBox, 0, SpringLayout.EAST, firstNameTextField);
		teacherDashBoardFrame.getContentPane().add(subjectComboBox);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, textField, 277, SpringLayout.NORTH, teacherDashBoardFrame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, subjectComboBox, -6, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.NORTH, lblDate, 2, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, firstNameTextField);
		textField.setColumns(10);
		teacherDashBoardFrame.getContentPane().add(textField);
	
	}

}
