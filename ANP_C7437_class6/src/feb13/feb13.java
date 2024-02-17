package feb13;

public class feb13
{  // Custom Exception & Exception propagation
	public static void check() throws ExcessAmountWithdrawException
	{
		Bank.withdraw(23232);
//		try {
//			
//		}catch(ExcessAmountWithdrawException e)
//		{
//			e.printStackTrace();
//		}
	}
	public static void main(String[] args) {
		//ek exception banao jisme aapko
		//bank aap banao yaani paise jayda nikalte hai customer toh
		//bank ko exception throw karna chahiye
		//you can't withdraw that much amount
		
		Bank obj = new Bank();
		obj.deposit(1200);
		obj.rate();
		
		try {
			feb13.check();
		}catch(ExcessAmountWithdrawException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
