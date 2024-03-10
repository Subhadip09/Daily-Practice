package studentApp.util;

public class QueryUtil {
	public static String insertCourse()
	{
		return "insert into course values(?, ?, ?)";
	}
	
	public static String updateFees()
	{
		return "update course set fees = ? where id = ?"; 
	}
	
	public static String deleteCourse()
	{
		return "delete from course where id = ?";
	}
	
	public static String searchInfoOfCourse()
	{
		return "select * from course where id = ?";
	}
	
	public static String createBatchUnderCourse()
	{
		return "insert into batch (total_seat, courseId) values(?,?)";
	}
	
	public static String updateTotalSeat()
	{
		return "update batch set total_seat = ? where id = ?";
	}
	
	public static String registerStudent()
	{
		return "insert into student values( ?, ?, ?, ?)";
	}
	
	public static String updateStudentDetails()
	{
		return "update student set userName = ?, password = ?, courseId = ? where id = ?";
	}
	
	public static String availableCourseWithSeats()
	{
		return "select c.id, c.name as course, b.total_seat as  available_seat from course c inner join batch b on b.courseId = c.id;";
	}
	
	public static String allocateStudentInBatch()
	{
		return "select s.userName as stu_name, b.id as batch_id, c.name as course_name from student s inner join course c on s.courseId = c.id inner join batch b on c.id = b.courseId";
	}
	
	public static String getStudentOfEachBatch()
	{
		return "select b.id as batch_id, s.username as stu_name from batch b inner join course c on b.courseId = c.id inner join student s on c.id = s.courseId;";
	}
}
