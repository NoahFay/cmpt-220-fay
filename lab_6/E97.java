public class E97 {
	public static void main(String[] args) {
			
		Account account = new Account(1122, 20000);
		account.withdraw(2500);
		account.deposit(3000);
		account.setAnnualInterestRate(4.5);
		System.out.println("ID" + account.getid());
		System.out.println("you got this account " + account.getDateCreated());
		System.out.println("Balance" + account.getBalance());
		System.out.println(" interest" + account.getMonthlyInterest());
			
	}
}
