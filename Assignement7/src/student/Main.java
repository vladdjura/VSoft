package student;

public class Main {

	public static void main(String[] args) {
		Student fastTrack = new FastTrackBachStudent();
		System.out.println("fee for fastTrackStudent for IT is "+ fastTrack.calculateFee("it"));
		Student corpStudent = new CorporateBachStudent();
		System.out.println("fee for corporate bach student for ART is "+ corpStudent.calculateFee("art"));
		Student weekendStudent = new WeekendBachStudent();
		System.out.println("fee for weekend bach student for ART is "+ weekendStudent.calculateFee("art"));
		Student corporateWeekend = new CorporateBachWeekendStudent();
		System.out.println("fee for corporate weekend bach student for IT  is "+ corporateWeekend.calculateFee("it"));
	}

}
