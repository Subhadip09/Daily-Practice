package lab5_feb17;

public class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String tax)
	{
		super(tax);
	}
}
