package student;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDetails{

	private ArrayList<Student>students;
	public StudentDaoImpl() {
		
		students = new ArrayList<>();
		students.add(new Student(0,"Vladislav" , "Sleepy Hollow", "191", "a@a.com"));
	}
	
	@Override
	public void addStudent(Student student) {
		students.add(student);
		
	}

	@Override
	public void viewAllStudents() {
		for(Student s:students) {
			System.out.println(s.toString());
		}
		
	}

	@Override
	public Student viewStudent(long id) {
		
		for(Student s:students) {
			if(s.getSno()==id) {
				
				return s;
				
			}
		}
		System.err.println("student with id "+ id+"is not existant ");
		return null;
	}

	@Override
	public void updateStudent(long id, Student student) {
		// TODO Auto-generated method stub
		 
			
		
		for(int i = 0; i<students.size();i++) {
			if(students.get(i).getSno()==id) {
				students.set(i, student);
				
			}
		}
		
	}

	@Override
	public void deleteStudent(long id) {
		
		students.remove(viewStudent(id));
		
		
	}
	

}
