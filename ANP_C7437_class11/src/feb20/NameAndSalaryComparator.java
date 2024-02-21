package feb20;

import java.util.Comparator;

public class NameAndSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpSalary() == o2.getEmpSalary())
		{
			return o1.getEmpName().compareTo(o2.getEmpName());
		}
		else if(o1.getEmpSalary() > o2.getEmpSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
		//return 0;
	}

}
