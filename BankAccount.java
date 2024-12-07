public class BankAccount{
	
	public int accountNumber;
    public int balance;
    
	public void setaccountNumber(int accountNumber){
		this.accountNumber=accountNumber;
	}
	public void setBalance(int amount){
		this.balance=balance;
	}
	
	public int getaccountNumber(){
		return accountNumber;
	}
	public int getBalance(){
		return balance;
	}
	
	public int deposit(int amount){
		return balance+amount;
	}
	public int withdraw(int amount){
		return balance-amount;
	}
	
	}
