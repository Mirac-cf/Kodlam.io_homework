package gun3_odev2;

public class Student extends User{
	private String[] courseList;
	private String studentNo;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String password,String[] courseList, String studentNo) {
		super(id,name,password);
		this.courseList = courseList;
		this.studentNo = studentNo;
	}


	public String[] getCourseList() {
		return courseList;
	}


	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}


	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	
	
	
}
