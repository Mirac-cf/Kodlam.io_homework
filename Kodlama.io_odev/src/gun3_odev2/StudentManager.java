package gun3_odev2;

public class StudentManager extends UserManager{
	
	public void add(Student student) {
		System.out.println("Ogrenci eklendi");
		System.out.println("id: " + student.getId());
		System.out.println("isim: " + student.getName());
		System.out.println("ogrenci no: " + student.getStudentNo());
	}
	
	@Override
	public void delete() {
		System.out.println("Ogrenci silindi");
	}
	
}
