package studentApp.Model;

public class Student {
	int id;
	String userName;
	String password;
	int courseId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Student() {
		super();
	}
	public Student(int id, String userName, String password, int courseId) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", password=" + password + ", courseId=" + courseId
				+ "]";
	}
	
}
