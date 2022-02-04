package student;

public class WeekendBachStudent extends Student {

	@Override
	public int calculateFee(String c) {
		// TODO Auto-generated method stub
		switch(c) {
		case "it": return 7000;
		case "management": return 17000;
		case "art": return 28000;
		}
		return 0;
	}

	
}
