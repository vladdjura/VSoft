package student;

public class FastTrackBachStudent extends Student {

	@Override
	public int calculateFee(String c) {
		// TODO Auto-generated method stub
		switch(c) {
		case "it": return 5000;
		case "management": return 25000;
		case "art": return 35000;
		}
		return 0;
	}
	
	
}
