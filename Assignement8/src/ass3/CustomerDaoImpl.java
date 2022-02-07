package ass3;

import java.util.Scanner;

public class CustomerDaoImpl implements CustomerDao{
	
	private Customer[] customers;
	private Scanner sc;
	private int id;
	
	public CustomerDaoImpl() {
		
		customers = new Customer[1000];
		sc = new Scanner(System.in);
		
	}
	
	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Please insert Customer name: ");
		String cName = sc.next();
		System.out.println("Please insert Customer adress");
		String cadd = sc.next();
		System.out.println("Please insert Customer emaill");
		String cEmail = sc.next();
		long cid = setId()==1?0:setId();
		customers[(int) cid] = new Customer(cid, cName, cadd, cEmail);
		
	}

	@Override
	public Customer[] viewAllCustomers() {
		
		return customers;
	}

	@Override
	public Customer viewCustomer() {
	System.out.println("please insert customer id");
	long cid = sc.nextLong();
	for(Customer c: customers) {
	if(c.getCno()==cid)
		return c;
	}
	return null;
	}

	private int setId() {
		id++;
		return id;
	}
}
