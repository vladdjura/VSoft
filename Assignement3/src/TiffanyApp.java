import java.util.Scanner;

public class TiffanyApp {
	private static Scanner sc;
	private static int totalBill = 0;
	private static int bondaBill = 0;
	private static int bondaPrice =50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		assignement3();
		
	}
	
	
	private static void assignement3() {
		System.out.println("for Biryani press 1: ");
		System.out.println("for drinks press 2: ");
		System.out.println("for ice cream press 3: ");
		System.out.println("for bills press 4: ");
		System.out.println("for exit press 5: ");
		int a = sc.nextInt();
		switch(a) {
		case 1: birayni();
		break;
		case 2: drinks();
		break;
		case 3: iceCream();
		break;
		case 4: System.out.println("bill");
		break;
		case 5:System.out.println("you have sucsessufully exit");
		System.exit(0);
		break;
		default:System.out.println("you have selected wrong option");
		}assignement3();
	}
	private static void birayni() {
		
		System.out.println("press 1 for Chicken bn");
		System.out.println("press 2 for Vegan bn");
		System.out.println("press 3 for Fish bn");
		System.out.println("press 4 for back");
		int a = sc.nextInt();
		
		switch(a) {
		case 1: System.out.println("Chicken bn");
		break;
		case 2: System.out.println("Vegeterian bn");
		break;
		case 3: System.out.println("Fish bn");
		break;
		case 4: System.out.println("back");
		assignement3();
		break;
		default: System.out.println("wrong number");
		birayni();
		}birayni();
	}
	private static void drinks() {
		System.out.println("press 1 for soft drink");
		System.out.println("press 2 for hot drink");
		System.out.println("press 3 back");
		int a = sc.nextInt();
		
		switch(a) {
		case 1: softDrink();
		break;
		case 2: hotDrinks();
		break;
		case 3: System.out.println("back");
		assignement3();
		break;
		default: System.out.println("wrong value");
		drinks();
		}drinks();
		}
		private static void iceCream() {
			System.out.println("press 1 for butter sc");
			System.out.println("press 2 for back");
			int a = sc.nextInt();
			switch(a) {
			case 1: System.out.println("butter sc");
			break;
			case 2: System.out.println("back");
			assignement3();
			break;
			default: System.out.println("wrong value");
			iceCream();
			break;
			}iceCream();
		}
	
	private static void softDrink() {
		System.out.println("press 1 for Sprite: ");
		System.out.println("press 2 for thumbs up: ");
		System.out.println("press 3 for back");
		int a = sc.nextInt();
		switch(a) {
		case 1:System.out.println("Sprite");
		break;
		case 2: System.out.println("Thumbs up");
		break;
		case 3: System.out.println("back");
		drinks();
		break;
		default: System.out.println("wrong value");
		softDrink();
		}softDrink();
	}
	private static void hotDrinks() {
		System.out.println("press 1 for Tea: ");
		System.out.println("press 2 for Coffee: ");
		System.out.println("press 3 for back: ");
		int a = sc.nextInt();
		switch(a){
		case 1: System.out.println("Tea");
		break;
		case 2: System.out.println("Coffee");
		break;
		case 3:System.out.println("back");
		drinks();
		break;
		default: System.out.println("wrong value");
		hotDrinks();
		}hotDrinks();
	}
}
