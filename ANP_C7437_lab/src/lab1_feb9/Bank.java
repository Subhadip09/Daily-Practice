package lab1_feb9;

public class Bank {
	private double amount;
	
	public Bank(double amount)
	{
		this.amount = amount;
	}
	
	public void withdraw(double withdrawalAmount)
	{
		if(withdrawalAmount <= this.amount)
		{
			System.out.println("withdraw successful");
			this.amount = this.amount - withdrawalAmount;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	
	public void deposit(double depositAmount)
	{
		this.amount = this.amount + depositAmount;
	}
	
	public void displayBalance()
	{
		System.out.println("Total balance is: "+ this.amount);
	}
	
	
	public static void main(String[] args)
	{
		Bank obj = new Bank(10000.0);
		
		obj.withdraw(2000.0);
		
		obj.deposit(5000.0);
		
		obj.displayBalance();
	}
}
