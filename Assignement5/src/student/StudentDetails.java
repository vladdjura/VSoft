package student;
import java.util.ArrayList;

public interface StudentDetails {

	void addStudent(Student student);
	void viewAllStudents();
	Student viewStudent(long id);
	
	void updateStudent(long id, Student student);
	void deleteStudent(long id);
	
	
	
	
}
