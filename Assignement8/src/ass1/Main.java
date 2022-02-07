package ass1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalculateAppImpl appImpl = new CalculateAppImpl();
		for(;;) {
			
		
		System.out.println("for add press 1");
		System.out.println("for sub press 2");
		System.out.println("for mul press 3");
		System.out.println("for exit press 0");
		int uc = sc.nextInt();
		switch(uc) {
		case 1:appImpl.add();
		break;
		case 2:appImpl.sub();
		break;
		case 3:appImpl.mul();
		break;
		case 0:System.out.println("Goodbye");
		System.exit(0);
		default:System.out.println("You choose wrong number");
		}
		}
	}

}
