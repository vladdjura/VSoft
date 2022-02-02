import java.util.ArrayList;

public interface StudentDetails {

	void addStudent(ArrayList<Student>students,Student student);
	void viewAllStudents();
	void viewStudent();
	void updateStudent(long id);
	void deleteStudent(long id);
	
	
}
