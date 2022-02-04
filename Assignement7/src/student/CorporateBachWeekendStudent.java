package student;

public class CorporateBachWeekendStudent extends Student {

	@Override
	public int calculateFee(String c) {
		// TODO Auto-generated method stub
		switch(c) {
		case "it": return 4000;
		case "management": return 14000;
		case "art": return 21000;
		}
		return 0;
	}
	
}
