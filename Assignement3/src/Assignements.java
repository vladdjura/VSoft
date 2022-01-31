import java.util.Scanner;

public class Assignements {

	
	private Scanner sc;
	private int totalBill = 0;
	private int bondaBill = 0;
	private int bondaPrice =50;
	
	public Assignements() {
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		
	}
	
	public void switchStatement(int N) {
		switch(N) {
		case 0: System.out.println("users select 0");
		break;
		case 1:System.out.println("users select 1");
		break;
		case 2:System.out.println("users select 2");
		break;
		default :System.out.println("user didnt selected 0,1,2");
	
		}
	}
	public void printTodaysThought(Day theDay)
	  {
	    switch (theDay)
	    {
	      case MONDAY:
	      case TUESDAY:
	      case WEDNESDAY:
	      case THURSDAY:  System.out.println("Preparing for party");
	                      break;

	      case FRIDAY:    System.out.println("Party ");
	                      break;

	      case SATURDAY:
	      case SUNDAY:    System.out.println("Play sports");
	                      break;

	      default:        System.out.println("What day is it?");;
	    }
	  }
	public void calculateTap(double a, double b, String operation) {
		switch(operation) {
		case "+":System.out.println("result for (a+b)"+ (a+b));
		break;
		
		case "-":System.out.println("result for (a-b)"+ (a-b));
		break;
		case"*":System.out.println("result for (a*b)"+ (a*b));
		break;
		case"3":System.out.println("you have sucsesfully exitted program)");
		System.exit(0);
		break;
		default:System.out.println("you have selected wrong operation");
		}
	}
	
	public void tiffanyApp() {
		System.out.println("To add Bonda press 1 \n To add Dosa press 2 \n To add IDLY 3 \n Bill press 4 \n exit press 5");
		int selection = sc.nextInt();
		switch(selection) {
		case 1: bonda();
		break;
		case 2: System.out.println("Dosa");
		break;
		case 3: System.out.println("IDLY");
		break;
		case 4:System.out.println("Total bill "+ bondaBill);
		break;
		case 5:System.out.println("you have sucsessufully exited from Tifany app");
		System.exit(0);
		break;
		default:System.out.println("you have selected wrong operation");
		}
		
	}
	
	public void bonda() {
		System.out.println("how many plates bond you want?");
		int plates = sc.nextInt();
		bondaBill = plates * bondaPrice;
		System.out.println(plates +" plates Bonda:" + bondaBill);
	}
	
	public void assignement3(int a) {
		switch(a) {
		case 1: birayni(5);
		break;
		case 2: drinks(3);
		break;
		case 3: iceCream(2);
		break;
		case 4: System.out.println("bill");
		break;
		case 5:System.out.println("you have sucsessufully exit");
		System.exit(0);
		break;
		default:System.out.println("you have selected wrong option");
		}
	}
	private void birayni(int a) {
		switch(a) {
		case 1: System.out.println("Chicken bn");
		break;
		case 2: System.out.println("Vegeterian bn");
		break;
		case 3: System.out.println("Fish bn");
		break;
		case 4: System.out.println("back");;
		break;
		default: System.out.println("wrong number");
		
		}
	}
	private void drinks(int a) {
		switch(a) {
		case 1: softDrink(5);
		break;
		case 2: hotDrinks(6);
		break;
		case 3: System.out.println("back");
		break;
		default: System.out.println("wrong value");
		}
		}
		private void iceCream(int a) {
			switch(a) {
			case 1: System.out.println("butter sc");
			break;
			case 2: System.out.println("back");
			break;
			default: System.out.println("wrong value");
			break;
			}
		}
	
	private void softDrink(int a) {
		switch(a) {
		case 1:System.out.println("Sprite");
		break;
		case 2: System.out.println("Thumbs up");
		break;
		case 3: System.out.println("back");
		break;
		default: System.out.println("wrong value");
		}
	}
	private void hotDrinks(int a) {
		switch(a){
		case 1: System.out.println("Tea");
		break;
		case 2: System.out.println("Coffee");
		break;
		case 3:System.out.println("back");
		break;
		default: System.out.println("wrong value");
		
		}
	}
	}

	/**
	 * Our "Day" enum type
	 */
	enum Day
	{
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	

