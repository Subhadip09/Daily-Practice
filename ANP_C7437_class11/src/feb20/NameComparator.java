package feb20;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		// To compare string this method will not work
		// toCompare method is used 
//		if(o1.getEmpName() == o2.getEmpName())
//		{
//			return 0;
//		}
//		else if(o1.getEmpName() > o2.getEmpName())
//		{
//			return 1;
//		}
//		else
//		{
//			return -1;
//		}
		
		return o1.getEmpName().compareTo(o2.getEmpName());
	}

}
