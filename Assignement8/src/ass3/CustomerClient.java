package ass3;

import java.util.Scanner;

public class CustomerClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerDaoImpl cusDaoImp = new CustomerDaoImpl();
		for(;;) {
			
		
		System.out.println("press 1 to add Customer");
		System.out.println("press 2 to view all Customer");
		System.out.println("press 3 to view specific Customer");
		System.out.println("press 0 for exit");
		int uc = sc.nextInt();
		switch(uc) {
		
		case 1: cusDaoImp.addCustomer();
		break;
		case 2: viewAllCustomer(cusDaoImp);
		break;
		case 3:System.out.println(cusDaoImp.viewCustomer().toString());
		break;
		case 0: System.out.println("Goodbye");
		System.exit(0);
		default:System.out.println("you have choosed wrong value");
		}
	}
	}
	private static void viewAllCustomer(CustomerDaoImpl impl) {
		Customer[] cs = impl.viewAllCustomers();
		for(Customer c:cs) {
			try {
				
			
			System.out.println(c.toString());
			}catch(NullPointerException ax) {
				
			}
		}
	}
	
}
