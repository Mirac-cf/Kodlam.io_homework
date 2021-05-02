package gun3_odev2;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.println("\nModerator atandý");
		System.out.println("id: "+instructor.getId());
		System.out.println("isim: " + instructor.getName());
		System.out.println("Mod no: " + instructor.getInstructorNo());
	}
	
	@Override
	public void delete() {
		System.out.println("Moderator silindi");
	}
	
}