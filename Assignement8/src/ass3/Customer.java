package ass3;

public class Customer {

	private long cno;
	private String cName;
	private String cAdd;
	private String cEmail;
	
	public Customer(long cno, String cName, String cAdd, String cEmail) {
		super();
		this.cno = cno;
		this.cName = cName;
		this.cAdd = cAdd;
		this.cEmail = cEmail;
	}
	public long getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAdd() {
		return cAdd;
	}
	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cName=" + cName + ", cAdd=" + cAdd + ", cEmail=" + cEmail + "]";
	}
	
	
	
	
}
