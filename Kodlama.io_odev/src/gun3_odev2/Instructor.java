package gun3_odev2;

public class Instructor extends User{
	private String[] studentList;
	private String InstructorNo;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String name, String password, String[] studentList, String instructorNo) {
		super(id, name, password);
		this.studentList = studentList;
		InstructorNo = instructorNo;
	}

	public String[] getStudentList() {
		return studentList;
	}

	public void setStudentList(String[] studentList) {
		this.studentList = studentList;
	}

	public String getInstructorNo() {
		return InstructorNo;
	}

	public void setInstructorNo(String instructorNo) {
		InstructorNo = instructorNo;
	}

	
	
}
