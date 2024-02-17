package lab5_feb17;

public class CalculatorSimulator {
	public static void main(String[] args) {
		TaxCalculator obj = new TaxCalculator();
//		// test case 1
//		try
//		{
//			double tax1 = obj.calculateTax("Ron", false, 34000);
//			System.out.println("Tax amount is: " + tax1);
//		}
//		catch(CountryNotValidException e)
//		{
//			System.out.println("Country not valid: "+ e.getMessage());
//			e.printStackTrace();
//			
//		}
//		catch(EmployeeNameInvalidException e)
//		{
//			System.out.println("Employee name not valid: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		catch(TaxNotEligibleException e)
//		{
//			System.out.println("Not eligible for Tax calculation: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		
//		// test case 2 
//		try
//		{
//			double tax1 = obj.calculateTax("Tim", true, 1000);
//			System.out.println("Tax amount is: " + tax1);
//		}
//		catch(CountryNotValidException e)
//		{
//			System.out.println("Country not valid: "+ e.getMessage());
//			e.printStackTrace();
//			
//		}
//		catch(EmployeeNameInvalidException e)
//		{
//			System.out.println("Employee name not valid: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		catch(TaxNotEligibleException e)
//		{
//			System.out.println("Not eligible for Tax calculation: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		
//		// test case 3
//		try
//		{
//			double tax1 = obj.calculateTax("Jack", true, 55000);
//			System.out.println("Tax amount is: " + tax1);
//		}
//		catch(CountryNotValidException e)
//		{
//			System.out.println("Country not valid: "+ e.getMessage());
//			e.printStackTrace();
//			
//		}
//		catch(EmployeeNameInvalidException e)
//		{
//			System.out.println("Employee name not valid: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		catch(TaxNotEligibleException e)
//		{
//			System.out.println("Not eligible for Tax calculation: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		
//		//test case 4
//		try
//		{
//			double tax1 = obj.calculateTax("", true, 30000);
//			System.out.println("Tax amount is: " + tax1);
//		}
//		catch(CountryNotValidException e)
//		{
//			System.out.println("Country not valid: "+ e.getMessage());
//			e.printStackTrace();
//			
//		}
//		catch(EmployeeNameInvalidException e)
//		{
//			System.out.println("Employee name not valid: "+ e.getMessage());
//			e.printStackTrace();
//		}
//		catch(TaxNotEligibleException e)
//		{
//			System.out.println("Not eligible for Tax calculation: "+ e.getMessage());
//			e.printStackTrace();
//		}
		
		// Test cases
        String[] employeeNames = {"Ron", "Tim", "Jack", ""};
        double[] employeeSalaries = {34000, 1000, 55000, 30000};
        boolean[] isIndian = {false, true, true, true};

        for (int i = 0; i < employeeNames.length; i++) {
            try 
            {
                double taxAmount = obj.calculateTax(employeeNames[i], isIndian[i], employeeSalaries[i]);
                System.out.println("Tax amount is " + taxAmount);
            } 
            catch (CountryNotValidException e) 
            {
                System.out.println("Country not valid: " + e.getMessage());
                e.printStackTrace();
            } 
            catch (EmployeeNameInvalidException e) 
            {
                System.out.println("Employee name not valid: " + e.getMessage());
                e.printStackTrace();
            } 
            catch (TaxNotEligibleException e) 
            {
                System.out.println("Not eligible for Tax calculation: " + e.getMessage());
                e.printStackTrace();
            }
        }
	}
}
