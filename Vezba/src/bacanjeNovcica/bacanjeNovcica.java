package bacanjeNovcica;

import java.util.Random;
import java.util.Scanner;

public class bacanjeNovcica {

	private Scanner sc;
	private int player;
	private int pc;
	private Random r;
	
	public bacanjeNovcica() {
		
		sc = new Scanner(System.in);
		r=new Random();
		bacanje();
		
	}
	private void bacanje() {
		
		for(;;) {
			
		
		System.out.println("Izaberite glavu ili pismo(1 gl, 2 pi) ");
		int uc = sc.nextInt();
		int novcic =0;
		if(uc!=3)
		 novcic = r.nextInt(2)+1;
		//System.out.println("dobili ste "+(novcic==1?"Glavu":"Pismo"));
		if(novcic==1) {
			System.out.println("Dobili ste glavu");
		}
		else if(novcic ==2) {
			System.out.println("Dobili ste pismo");
		}
		if(novcic == uc) {
			System.out.println("korisnik je pobedio");
			player++;
		}else if(uc == 3) {
			System.out.println("player ima ukupno "+player +" pobede.");
			System.out.println("pc ima ukupno "+pc +" pobede.");
			if(player > pc) {
				System.out.println("pobedili ste");
			}else if(pc>player) {
				System.out.println("pc je pobedio");
			}else {
				System.out.println("nereseno je");
			}
			System.out.println("goodbye");
			System.exit(0);
		}
		else {
			
			
			System.out.println("izgubili ste");
			pc++;
			
			
		}
		
		}
		
		//System.out.println("dobili ste");
		
		
	}
	
	
}
