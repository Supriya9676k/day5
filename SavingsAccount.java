public class SavingsAccount extends BankAccount {
	
	public int withdraw(int amount){
		int remaining=balance;
		if(balance>100)
		remaining=balance-amount;
		return remaining;
	}
	
	}
