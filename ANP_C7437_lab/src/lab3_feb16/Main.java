package lab3_feb16;

public class Main {
	public static void main(String[] args) {
		HillStations obj = new HillStations();
		obj.location();
		obj.famousFor();
		
		System.out.println();
		
		HillStations obj1 = new Manali();
		obj1.location();
		obj1.famousFor();
		
		System.out.println();
		
		HillStations obj2 = new Mussoorie();
		obj2.location();
		obj2.famousFor();
		
		System.out.println();
		
		HillStations obj3 = new Gulmarg();
		obj3.location();
		obj3.famousFor();
	}
}
