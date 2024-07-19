import java.util.ArrayList;


public class Account {
	
	// Name of the account
	private String acctName;
	
	// The current account balance of the account
	private double balance;
	
	// the account ID Number
	private String uuid;
	
	// The user object which will own this account
	private User holder;
	
	// The transactions for this account
	private ArrayList<Transaction> transactions;

}
