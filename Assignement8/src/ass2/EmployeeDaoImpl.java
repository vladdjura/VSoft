package ass2;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private ArrayList<Employee> emp  ;
	private Scanner sc;
	
	public EmployeeDaoImpl() {
		
		emp = new ArrayList<Employee>();
		sc = new Scanner(System.in);
		
		menu();
	}
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		
		System.out.println("please insert id for Employee");
		long id = sc.nextLong();
		System.out.println("please insert Employee name");
		String name = sc.next();
		emp.add(new Employee(id, name));
		
	}

	@Override
	public void viewEmployee() {
		for(Employee e: emp) {
			System.out.println(e.toString());
			
		}
		
	}
	private void menu() {
		for(;;) {
			System.out.println("to add employee press 1");
			System.out.println("to view all employees press 2");
			System.out.println("to exit press 0");
			int uc  = sc.nextInt();
			switch(uc) {
			
			case 1: addEmployee();
			break;
			case 2: viewEmployee();
			break;
			case 0: System.out.println("goodbye");
			System.exit(0);
			default: System.out.println("you choose wrong value");
			
			}
			
			
		}
	}
	
}
