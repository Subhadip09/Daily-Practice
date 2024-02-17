package feb13;

public class Bank extends RBI
{
	static double amount;
	
	public Bank()
	{
		this.amount = 1000;
	}
	
	public void deposit(double d)
	{
		amount = amount + d;
		System.out.println("ab aapka paisa "+ amount);
	}
	
	public void rate()
	{
		System.out.println("kuch bhi");
	}
	
	public static void withdraw(double d) throws ExcessAmountWithdrawException
	{
		if(d>amount)
		{
			throw new ExcessAmountWithdrawException("itna paisa");
		}
		amount = amount - d;
		System.out.println("abhi "+ amount +"amount bacha");
	}
}
