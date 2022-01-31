package javaaaa;

public class Questions {

	private int temp;
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}
	
	public void swapTwoNumbers(int a, int b) {
		System.out.println("before swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("after swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
	
	public void swapTwoNumbersWT(int a, int b) {
		
		System.out.println("before swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("after swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
	
	public void threeNumber(int x, int y, int z) {
		System.out.println("before swapping");
		System.out.println("value x ="+ x);
		System.out.println("value y ="+ y);
		System.out.println("value z ="+ z);
		int temp = x;

		x = z;
		z= y;
		y = temp;
		System.out.println("after swapping");
		System.out.println("value x ="+ x);
		System.out.println("value y ="+ y);
		System.out.println("value z ="+ z);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		
		
	}
	public void swapThreeNumbers(int x, int y, int z) {
		
		System.out.println("before swapping");
		System.out.println("value x ="+ x);
		System.out.println("value y ="+ y);
		System.out.println("value z ="+ z);
		 temp = x;

		x = z;
		z= y;
		y = temp;
		System.out.println("after swapping");
		System.out.println("value x ="+ x);
		System.out.println("value y ="+ y);
		System.out.println("value z ="+ z);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
	
	public void swapFourNumbers(int a, int b, int c, int d){
		
		
		System.out.println("before swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println("value c ="+ c);
		System.out.println("value d ="+ d);
		
		int temp = a+b;
		b = temp-b;
		a = temp-b;
		
		temp = b+c;
		c = temp-c;
		b = temp-c;
		
		temp = c+d;
		d=temp-d;
		c=temp-d;
		
		System.out.println("after swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println("value c ="+ c);
		System.out.println("value d ="+ d);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
	
	public void swapFourNumbersWT(int a, int b, int c, int d){
		
		
		System.out.println("before swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println("value c ="+ c);
		System.out.println("value d ="+ d);
		
		temp = a+b;
		b = temp-b;
		a = temp-b;
		
		temp = b+c;
		c = temp-c;
		b = temp-c;
		
		temp = c+d;
		d=temp-d;
		c=temp-d;
		
		System.out.println("after swapping");
		System.out.println("value a ="+ a);
		System.out.println("value b ="+ b);
		System.out.println("value c ="+ c);
		System.out.println("value d ="+ d);
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
	}
	
	public void silverPlanCost() {
		double temp = 699;
		double finalPrice = temp*18/100+temp;
		System.out.println("Final price="+finalPrice);
		
	}
	public void pizzaDiscount() {
		double pizzaPrice = 399.0;
		double finalPrice = pizzaPrice*2-pizzaPrice*2*20/100;
		System.out.println("Final price="+finalPrice);
	}
	public void salary() {
		double salary = 85000;
		double tax = 85000 * 20/100;
		System.out.println("total amount of tax= "+tax);
		System.out.println("total salary"+(salary-tax));
	}
	public void calculateDeposit() {
		double deposit = 500000;
		double interest = deposit*5*6.8/100;
		System.out.println("total interest = " + interest);
		System.out.println("interest per month =" + (interest/60));
		System.out.println("deposit is"+(deposit+interest));
	}
}
