package ass1;
import java.util.Scanner;

public class CalculateAppImpl implements CalculateApp{
	
	private double num1;
	private double num2;
	private Scanner sc;
	public CalculateAppImpl() {
		sc = new Scanner(System.in);
	}
	
	@Override
	public void add() {
		System.out.println("please enter first number");
		num1 = sc.nextDouble();
		System.out.println("please enter second number");
		num2 = sc.nextDouble();
		System.out.println(" x+y = "+ (num1+num2));
		
	}

	@Override
	public void sub() {
		
		System.out.println("please enter first number");
		num1 = sc.nextDouble();
		System.out.println("please enter second number");
		num2 = sc.nextDouble();
		System.out.println(" x-y = "+ (num1-num2));
		
		
	}

	@Override
	public void mul() {
		
		System.out.println("please enter first number");
		num1 = sc.nextDouble();
		System.out.println("please enter second number");
		num2 = sc.nextDouble();
		System.out.println(" x*y = "+ (num1*num2));
		
	}

	
	
}
