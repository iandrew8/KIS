/**
 * Database Handler for persisting a student's mark into the database
 */
package kis.databaseservices;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import kis.interfaces.GenericInterface;
import kis.student.gui.Student;
import kis.teacher.gui.Score;

public class RecordMarksHandler implements GenericInterface{

	KatikamuDbConnection dbConnection = new KatikamuDbConnection();
	public boolean recordStudentMarks(Score score) {
		try {
			Connection connection = dbConnection.getDbConnection();
			Statement statement = connection.createStatement();
			
		
			return true;
		}catch(SQLException sqlException) {
			System.out.println("Got exception while recording marks "+sqlException.getMessage());
			return false;
		}
	}

	@Override
	public boolean registerStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
