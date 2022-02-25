package model;

public class BookTickets {
	
	private long id;
	private String customerName;
	private String movieName;
	private int quantity;
	
	public BookTickets(long id, String customerName, String movieName, int quantity) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.movieName = movieName;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookTickets [id=" + id + ", customerName=" + customerName + ", movieName=" + movieName + ", quantity="
				+ quantity + "]";
	}
	
	
	
}
