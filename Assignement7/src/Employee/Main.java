package Employee;

public class Main {

	public static void main(String[] args) {
	Employee it = new Employee(1, " John", "it");
	Employee hr = new Employee(1, " Mark", "hr");
	Employee account = new Employee(1, " Brian", "account");
	printSalary(account);
	printSalary(hr);
	printSalary(it);
	
	}
	private static void printSalary(Employee e) {
			
		switch(e.getdName()) {
		case "it":
			System.out.println(e.geteNAme()+" have salary "+ new ItDepartement().calculateSalary());
			break;
		case "hr": System.out.println(e.geteNAme()+" have salary "+ new HrDepartement().calculateSalary());
		break;
		case"account": System.out.println(e.geteNAme()+" have salary "+ new AccountDepartement().calculateSalary());
		break;
		
		}
	}
}
