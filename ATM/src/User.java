import java.util.ArrayList;

public class User {
	// First name of the account holder
		private String fName;
		
		// Last name of the account holder
		private String lName;
		
		// Unique Identifier of the account holder
		private String uuid;
		
		// Has of the user's PIN number
		private byte pinHash[];
		
		// The List of accounts for this user
		private ArrayList<Account> accounts;
		
}