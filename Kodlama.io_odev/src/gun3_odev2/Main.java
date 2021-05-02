package gun3_odev2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Kulanici","123");
		user1.setName("Kullanici");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("OgrenciMehmet");
		student1.setStudentNo("906");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setName("ModeratorAhmet");
		instructor1.setInstructorNo("7117");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		
		Manager manager = new Manager();
		System.out.println("");
		manager.delete(instructorManager);
		manager.delete(studentManager);
		
		
		
	}

}
