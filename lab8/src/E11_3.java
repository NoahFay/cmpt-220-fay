public class E11_3 {
	
	public static void main(String[] args) {
		//Account
		Account account = new Account(1122, 20000);
		Savings savings = new Savings(1001, 20000);
		Checkings checking = new Checkings(1004, 20000, -20);
		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		// print 
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}