package feb9;

public class Student {
	int id;
	String name;
	static String collegeName = "UEM";
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college="+ collegeName +"]";
	}
}
