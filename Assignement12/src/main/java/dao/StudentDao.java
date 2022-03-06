package dao;

import java.util.ArrayList;

import model.Student;

public interface StudentDao {
	
	ArrayList<Student> findAllStudents();
	Student findStudentById(int id);
	Student saveStudent(Student s);
	Student deleteStudentById(int id);
	Student updateStudent(Student s);
	
	
		
	
}
