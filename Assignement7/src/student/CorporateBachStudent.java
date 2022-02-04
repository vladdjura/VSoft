package student;

public class CorporateBachStudent extends Student{

	@Override
	public int calculateFee(String c) {
		// TODO Auto-generated method stub
		switch(c) {
		case "it": return 9000;
		case "management": return 16000;
		case "art": return 26000;
		}
		return 0;
	}
	

}
