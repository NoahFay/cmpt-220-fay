import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	
	Account() {
		this(0, 0); 
	}

	// id account
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// sets id 
	/** Set id */
	public void setId(int id) {
		this.id = id;
	}

	// Cash in acount 
	public void setBalance(double balance) {
		this.balance = balance;
	}

//intrest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	
	public int getId() {
		return id;
	}

	//get cash
	public double getBalance() {
		return balance;
	}

	// gets intrest rate 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
//date
	public String getDateCreated() {
		return dateCreated.toString();
	}

	//returns all information 
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}


	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	
	public void withdraw(double amount) {
		balance -= amount;
	}

	
	public void deposit(double amount) {
		balance += amount;
	}

	
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}