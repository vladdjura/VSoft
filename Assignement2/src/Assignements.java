import java.util.Scanner;

public class Assignements {

	private Scanner sc;
	
	public Assignements() {
		
		sc=new Scanner(System.in);
	}
	
	public void printingStars() {
		for(int i = 0;i<5;i++) {
			System.out.println("*****");
			
		}
	}
	public void printA(){
		for(int i = 0;i<4;i++) {
			System.out.println("AAAAA");
		}
	}
	public void printNumbers() {
		for(int i = 0;i<5;i++) {
			System.out.println("12345");
		}
	}
	public void printing(int counter, String message) {
		for(int i = 0;i<counter;i++) {
			System.out.println(message);
		}
	}
	public void printS(){
			int temp = 5;
			for(int i = 1;i<=temp;i++) {
				for(int j = temp;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	public void printSB() {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void monkeys() {
		for(int i = 0; i < 5; i++) {
			if(i == 4 || i ==0) {
				System.out.println("@@@@@");
			}else {
				System.out.println("@   @");
			}
		}
	}
	public void numbers() {
		for(int i =1;i<=100;i++) {
			System.out.print(i);
		}
	}
	public void oddNumbers() {
		for(int i =1;i<=50;i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
		}
	}
	public void evenNumbers() {
		for(int i =1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	public void everyThird(){
		for(int i = 1;i<=50;i=i+3) {
			System.out.print(i + "");
		}
	}
	public void printABCD(){
		for(int i = 0;i<6;i++) {
			System.out.println("ABCDE");
		}
	}
	public void printAlphabet() {
		for(char c= 'A';c<='Z';c++) {
			System.out.print(c);
		}
	}
	public void primeNumber() {
		System.out.println("Please input number to check");
		int number = sc.nextInt();
		int i ;
		int m= 0;
		int flag = 0;
		m = number/2;
		if(number == 0 || number == 1) {
			System.out.println(number+" is not prime number");
		}else{
			for(i = 0; i<=m;i++) {
				if (number%2==0) {
				System.out.println(number+" is not prime number");
				flag =1;
				break;
				}
			}
			if (flag ==0) {
				System.out.println(number+" is prime number");
			}
		}
	}
	public void palindrome() {
		System.out.println("please enter word for checking");
		String word = sc.nextLine();
		boolean flag = true;
		int i = 0;
		int j = word.length()-1;
		if(!word.isEmpty()) {
			
		
		while (j > i) {
			if (word.charAt(i)!=word.charAt(j)) {
				System.out.println(word+" this word is not palindrome");
				flag = false;
				break;
			}
			i++;
			j--;
		}if(flag)
		System.out.println(word+" is palindrome");
	}else {
		System.out.println("you cant enter empty word");
		palindrome();
	}
		
	}
	public void calculateFactoriel() {
		System.out.println("enter one number to calculate its factoriel");
		int n = sc.nextInt();
		int i;
		int f = 1;
		if(n<0) {
			System.out.println("number should not be negative");
			calculateFactoriel();
			
		}else {
			for(i=1; i<=n;i++) {
				f*=i;
			}
			System.out.println("factoriel of " + n + " is ="+f);
		}
	}
	}

