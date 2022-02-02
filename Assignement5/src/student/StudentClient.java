package student;
import java.util.Scanner;

public class StudentClient {

	private long id;
	private String sName;
	private String sAdd;
	private String phoneNumber;
	private String emailId;
	private StudentDaoImpl daoImpl;
	private Scanner sc;

	public StudentClient() {
		daoImpl = new StudentDaoImpl();
		sc = new Scanner(System.in);
		id = 1;
		menu();

	}

	private void menu() {
		System.out.println("press 1 for student: ");
		System.out.println("press 2 for exit: ");
		int userChoice = sc.nextInt();
		if (userChoice == 1) {
			studentMenu();
		} else if (userChoice == 2) {
			System.out.println("goodbye");
			System.exit(0);
		} else {
			System.out.println("please select 1 or 2:");
			menu();
		}

	}

	private void studentMenu() {
		System.out.println("press 1 for add student");
		System.out.println("press 2 for view all students: ");
		System.out.println("press 3 to view one specific student: ");
		System.out.println("press 4 for update student: ");
		System.out.println("press 5 for delete student: ");
		int userChoice = sc.nextInt();
		switch (userChoice) {
		case 1:
			addStudent();
			break;
		case 2:
			daoImpl.viewAllStudents();
			break;

		case 3:
			findStudentById();
			break;

		case 4:
			updateStudent();
			break;

		case 5:
			deleteStudent();
			break;
		}
		studentMenu();
	}

	private void addStudent() {
		System.out.println("please insert student name");
		sName = sc.next();
		System.out.println("please insert student adress");
		sAdd = sc.next();
		System.out.println("please insert student number");
		phoneNumber = sc.next();
		System.out.println("please insert student email");
		emailId = sc.next();
		daoImpl.addStudent(new Student(id, sName, sAdd, phoneNumber, emailId));
		id++;

	}

	private void findStudentById() {
		System.out.println("Please enter your id: ");
		long userChoice = sc.nextLong();
		Student s = daoImpl.viewStudent(userChoice);
		if (s != null)
			System.out.println(s.toString());
	}

	private void updateStudent() {
		System.out.println("please insert id for update");
		long userChoice = sc.nextLong();
		Student s = daoImpl.viewStudent(userChoice);
		if (s != null) {
			System.out.println("to change student name press 1");
			System.out.println("to change student adress press 2");
			System.out.println("to change student phone number press 3");
			System.out.println("to change student email press 4");
			int userChoice1 = sc.nextInt();
			switch (userChoice1) {
			case 1:
				System.out.println("please insert new student name");
				s.setsName(sc.next());
				break;

			case 2:

				System.out.println("please insert new student adress");
				s.setsAdd(sc.next());
				break;

			case 3:
				System.out.println("please insert new student number");
				s.setPhoneNumber(sc.next());
				break;

			case 4:
				System.out.println("please insert student email");
				s.setEmailId(sc.next());
				break;

			}
			daoImpl.updateStudent(userChoice, s);

		}
	}

	private void deleteStudent() {
		System.out.println("please insert student id for delete: ");
		long userChoice = sc.nextLong();
		Student s = daoImpl.viewStudent(userChoice);
		if (s != null) {
			daoImpl.deleteStudent(userChoice);
		}

	}
}
