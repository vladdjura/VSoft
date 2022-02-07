package Employee;

public class Employee {

	private long eno;
	private String eNAme;
	private String dName;
	
	
	
	public Employee(long eno, String eNAme, String dName) {
		super();
		this.eno = eno;
		this.eNAme = eNAme;
		this.dName = dName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public double calculateSalary() {

	
		return 0;
	}

	public long getEno() {
		return eno;
	}

	public void setEno(long eno) {
		this.eno = eno;
	}

	public String geteNAme() {
		return eNAme;
	}

	public void seteNAme(String eNAme) {
		this.eNAme = eNAme;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", eNAme=" + eNAme + ", dName=" + dName + "]";
	}

}
