package feb8;

import java.util.Objects;

public class Student {
	// java bean kaise banati or isk purpose


	// 1. saere variable private
	// 2. create getter & setter
	// 3. private & default constructor
	// 4. making toString
	private int studentId;
	
	private String studentName;
	
	private int marks;
	
	
	// get method
	
	public int getStudentId()
	{
		return studentId;
	}
	
	// set method
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	// very very imp
	// constructor
	// jab aap constructor nahi banate ho toh jvm khud apko default constructor har class ka bana deta hai
	
	

	// default constructor
	public Student()
	{
		// implicitly ye deraha hai object or that class
	}
	
	public Student(int id, String name, int marks)
	{
		this.studentId = id;
		this.marks = marks;
		this.studentName = name;
	}
	// jab bhi hm parameter vala constructor banayenge tab default vala jo jvm de rhaha tha vo gayab ho jayega
	// aapki jimmedari ki parametrr bana rho toh default bhi banao

	
	
	// by implementing a method call toString
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	// oops concept- encapsulation, abstraction, inheritance, polymorphism
	
	
	// hashCode() & equals()
	@Override
	public int hashCode() {
		return Objects.hash(marks, studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return marks == other.marks && studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
}
