import java.util.Scanner;

public class TiffanyApp {
	private static Scanner sc;
	private static int totalBill = 0;
	private static int chickenBn = 20;
	private static int vegBn =50;
	private static int fishBn = 40;
	private static int sprite = 30;
	private static int thumbsUp = 5;
	private static int tea = 25;
	private static int coffee = 10;
	private static int butterSc = 5;
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
		case 4: printBill();
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
		calculateBill(chickenBn);
		break;
		case 2: System.out.println("Vegeterian bn");
		calculateBill(vegBn);
		break;
		case 3: System.out.println("Fish bn");
		calculateBill(fishBn);
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
			calculateBill(butterSc);
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
		calculateBill(sprite);
		break;
		case 2: System.out.println("Thumbs up");
		calculateBill(thumbsUp);
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
		calculateBill(tea);
		break;
		case 2: System.out.println("Coffee");
		calculateBill(coffee);
		break;
		case 3:System.out.println("back");
		drinks();
		break;
		default: System.out.println("wrong value");
		hotDrinks();
		}hotDrinks();
	}
	private static void calculateBill(int price) {
		System.out.println("how many products ");
		int quantity = sc.nextInt();
		totalBill += quantity*price;
		
	}
	private static void printBill() {
		System.out.println("the bill for your order is "+totalBill);
	}
}
