package feb20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMap {
	public static void main(String[] args)
	{
		//HashMap
		System.out.println("<------HashMap------>");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Subhadip", 90);
		map.put("Virat", 95);
		map.put("Anushka", 80);
		map.put("Roni", 82);
		map.put("Vikash", 92);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		for(Entry<String, Integer>  e: set)
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		
		//LinkedHashMap
		//follows the insertion order
		System.out.println("<------LinkedHashMap------>");
		Map<String, Integer> lmap = new LinkedHashMap<String, Integer>();
		lmap.put("Subhadip", 90);
		lmap.put("Virat", 95);
		lmap.put("Anushka", 80);
		lmap.put("Roni", 82);
		lmap.put("Vikash", 92);
		
		Set<Entry<String, Integer>> lset = lmap.entrySet();
		
		for(Entry<String, Integer>  el: lset)
		{
			System.out.println(el.getKey()+"----->"+el.getValue());
		}
		
		//TreeMap
		System.out.println("<------TreeMap------>");
		Map<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("Subhadip", 90);
		tmap.put("Virat", 95);
		tmap.put("Anushka", 80);
		tmap.put("Roni", 82);
		tmap.put("Vikash", 92);
				
		Set<Entry<String, Integer>> tset = tmap.entrySet();
				
		for(Entry<String, Integer>  et: tset)
		{
			System.out.println(et.getKey()+"----->"+et.getValue());
		}
	}
}
