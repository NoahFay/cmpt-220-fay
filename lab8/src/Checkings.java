public class Checkings
		extends Account {
	// Data fields
	private double overdraftLimit;

	/** Construct a default CheckingAccount object */
	public Checkings() {
		super();
		overdraftLimit = -20;
	}

	/** Construct a CheckingAccout with specified id, balance and overdraftLimit */
	public Checkings(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	/** Set a new overdraft limit */
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	/** Return overdraft limit */
	public double getOverdraftLimit() {
		return overdraftLimit;
	}


	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}

	
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + 
		String.format("%.2f", overdraftLimit);
	}
}