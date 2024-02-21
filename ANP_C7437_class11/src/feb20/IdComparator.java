package feb20;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpId() == o2.getEmpId())
		{
			return 0;
		} 
		else if(o1.getEmpId() > o2.getEmpId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
//		return 0;
	}
	
}
