package loginManagementSystem;

public interface Authorization {

	void register();
	boolean verifiedUsed(String username, String password);
	
}
