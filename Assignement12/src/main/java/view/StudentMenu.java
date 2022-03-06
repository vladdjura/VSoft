package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import dao.StudentDaoImpl;
import model.Address;
import model.Student;

public class StudentMenu {
	
	private int studentId;
	private String sName;
	private int courseFee;
	private int houseNumber;
	private String street;
	private String city;
	private Scanner sc;
	private StudentDaoImpl impl;
	
	public StudentMenu() {
		impl = new StudentDaoImpl();
		sc = new Scanner(System.in);
		mainMenu();
	}
	private void mainMenu() {
		System.out.println("to view all students press 1");
		System.out.println("to find students by ID press 2");
		System.out.println("to save student press 3");
		System.out.println("to delete student press 4");
		System.out.println("to update student press  5");
		System.out.println("to back to my menu press 6");
		try {
			int uc = sc.nextInt();
			switch(uc){
				case 1:findAllStudents();
					break;
				case 2:findStudentById();
				break;
				case 3:saveStudents();
				break;
				case 4:delete();
				break;
				case 5:update();
				break;
				case 6:new Menu();
				
					
					default:System.err.println("you choose wrong value please try again");
					mainMenu();
			}
		}catch(InputMismatchException e) {
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
			mainMenu();
			
		}
		mainMenu();
	}
	private void findAllStudents() {
		System.out.println("All students from database");
		ArrayList<Student> students = impl.findAllStudents();
		for(Student s:students) {
			System.out.println(s.toString());
		}
	}
	private void findStudentById() {
		findAllStudents();
		System.out.println("please input id from the student");
		try {
			int uc = sc.nextInt();
			Student student =impl.findStudentById(uc);
			if(student!=null) {
				System.out.println(student.toString());
				
			}else {
				System.err.println("student with this id = "+uc+"is not exist");
				findStudentById();
			}
		}
		catch(InputMismatchException e) {
			System.err.println("please choose only a digit ");
			sc = new Scanner(System.in);
			findStudentById();
		}
	}
	private void saveStudents() {
		System.out.println("please insert student name");
		sName = sc.next();
		try {
			System.out.println("please insert course fee");
			courseFee = sc.nextInt();
			System.out.println("please insert house number");
			houseNumber = sc.nextInt();
			System.out.println("please insert city");
			System.out.println("please insert street name");
			street = sc.nextLine();
			city = sc.nextLine();
			
			Address address = new Address(houseNumber, street, city);
			Student student = new Student(studentId, sName, courseFee, address);
			impl.saveStudent(student);
		}catch(InputMismatchException e) {
			
			System.err.println("please choose only a digit ");
			sc = new Scanner(System.in);
			saveStudents();
		}
		
		
		
	}
	private void delete() {
		findAllStudents();
		System.out.println("please choose which student to delete");
		try {
			int uc = sc.nextInt();
			Student student =impl.findStudentById(uc);
			if(student!=null) {
				impl.deleteStudentById(uc);
				
			}else {
				System.err.println("student with this id = "+uc+"is not exist");
				findStudentById();
			}
		}
		catch(InputMismatchException e) {
			System.err.println("please choose only a digit ");
			sc = new Scanner(System.in);
			findStudentById();
		}
		
	}
	private void update() {
		
		findAllStudents();
		System.out.println("please input id from the student that you want to update");
		try {
			int uc = sc.nextInt();
			Student student =impl.findStudentById(uc);
			if(student!=null) {
				System.out.println("please input the new name for student");
				sName = sc.next();
				System.out.println("please insert new course fee");
				courseFee = sc.nextInt();
				System.out.println("please input new house number ");
				houseNumber = sc.nextInt();
				System.out.println("please insert new student street name");
				sc.skip("\\R?");
				street = sc.nextLine();
				
				System.out.println("Please input new student city");
				city = sc.nextLine();
				Address a = new Address(houseNumber, street, city);
				student.setsName(sName);
				student.setCourseFee(courseFee);
				student.setAdress(a);
				System.out.println(student.toString());
				impl.updateStudent(student);
			}else {
				System.err.println("student with this id = "+uc+"is not exist");
				findStudentById();
			}
		}
		catch(InputMismatchException e) {
			System.err.println("please choose only a digit ");
			sc = new Scanner(System.in);
			findStudentById();
		}
	}
}
//imamo negde (\\R?)