package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.Id;

import dao.EmployeeIDaoImpl;
import model.Address;
import model.Employee;

public class EmployeeMenu {
	private int employeeId;
	private String eName;
	private double salary;
	private String designation;
	private int houseNumber;
	private String street;
	private String city;
	private Scanner sc;
	private EmployeeIDaoImpl daoImpl;
	public EmployeeMenu() {
		sc = new Scanner(System.in);
		daoImpl = new EmployeeIDaoImpl();
		mainMenu();
	}
	private void mainMenu() {
		System.out.println("To view all employes press 1:");
		System.out.println("To find employee by id press 2:");
		System.out.println("To save press 3:");
		System.out.println("To delete press 4");
		System.out.println("To update press 5");
		System.out.println("To go back press 6");
		try {
			
		int userChoice = sc.nextInt();
		switch (userChoice) {
		case 1:findAll();
			
			break;
		case 2:findAllEmployeesById();
		
			break;
		case 3:saveAllEmployees();
			
			break;
		case 4:deleteEmployee();
		
			break;
			
		case 5:updateEmployee();
		
			break;
		case 6:new Menu();
			
		default:System.err.println("you choose wrong value please try again");
		mainMenu();
		break;
		}
		}catch(InputMismatchException e) {
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
			mainMenu();
			
		}
		mainMenu();
	}
	private void findAll() {
		System.out.println("all employees in db");
		ArrayList<Employee> employees =daoImpl.findAllEmployee();
		for(Employee e:employees) {
			System.out.println(e.toString());
		}
	
	}
	
	private void findAllEmployeesById(){
		findAll();
		System.out.println("Please insert id for employee");
		try {
			int uc = sc.nextInt();
			Employee e = daoImpl.findEmployeeById(uc);
			if(e != null) {
				System.out.println(e.toString());
			}else {
				System.err.println("Employee with id"+uc+" doesnt exist");
			}
		}catch(InputMismatchException e){
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
			findAllEmployeesById();
		}
	}
	private void saveAllEmployees() {
		System.out.println("Please input employee name:");
		eName = sc.next();
		System.out.println("Please input employee salary ");
		try {
			salary = sc.nextDouble();
			System.out.println("please input employee designation ");
			sc.skip("\\R?");
			designation = sc.nextLine();
			System.out.println("Please input employee house number");
			houseNumber = sc.nextInt();
			sc.skip("\\R?");
			System.out.println("please input employee street ");
			street = sc.nextLine();
			sc.skip("\\R?");
			System.out.println("please inpute employee city");
			city = sc.nextLine();
			Address a = new Address(houseNumber, street, city);
			Employee e = new Employee(eName, salary, designation, a);
			daoImpl.saveEmployee(e);
			
		}catch(InputMismatchException e) {
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
					saveAllEmployees();
		}
		
	}
	private void deleteEmployee() {
		findAll();
		System.out.println("please insert id by employee you want to delete");
		try {
			int uc = sc.nextInt();
			Employee e = daoImpl.findEmployeeById(uc);
			if(e!=null){
				daoImpl.deleteEmployee(uc);
			}else {
				System.out.println("employee id doesnt exist");
			}
		}catch(InputMismatchException e) {
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
					deleteEmployee();
		}
	}
	private void updateEmployee() {
		
		findAll();
		System.out.println("please insert id from student you want to update");
		try {
			int uc = sc.nextInt();
			Employee e = daoImpl.findEmployeeById(uc);
			if(e!=null) {
				System.out.println("Please insert new employee name");
				eName = sc.next();
				System.out.println("please input new employer salary");
				salary = sc.nextDouble();
				System.out.println("please input new employer designation");
				designation = sc.next(); 
				System.out.println("please input new employer house number");
				houseNumber = sc.nextInt();
				System.out.println("please input new employer street");
				sc.skip("\\R?");
				street = sc.nextLine();
				System.out.println("please input new employer city");
				sc.skip("\\R?");
				city = sc.nextLine();
				Address a = new Address(houseNumber, street, city);
				Employee empl = new Employee(eName, salary, designation, a);
				daoImpl.saveEmployee(empl);
				
			}
			
			
		}catch(InputMismatchException e) {
			System.err.println("please choose only a digit");
			sc = new Scanner(System.in);
					deleteEmployee();
		}
	}
	
}
