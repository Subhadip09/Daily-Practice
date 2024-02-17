package feb16;

public class Student {
	// I am creating address as datatype into student class
	// and this is called has-a relationship
	
	private String name;
	
	private int id;
	
	//has a relationship ka example
	private Address address;

	public Student()
	{
		super();
	}
	
	public Student(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	//getter setter, parameter const, default const, toString
}
