package gun2_odev1;

public class Kurs {

	private String name;
    private int tamamlama;  
    public String teacher;
  

    public Kurs(String name, int tamamlama, String teacher) {
        this.name = name;
        this.tamamlama = tamamlama;
        this.teacher = teacher;
    }

    
    public String getName() {
        return name;
    }

    public int getTamamlama() {
        return tamamlama;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTamamlama(int tamamlama) {
        this.tamamlama = tamamlama;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    
    public void kursSec(String name){
        System.out.println(name + " kursuna kayit yapildi.");
    }
    
    public void bilgileriGoster(){
        System.out.println("*********************");
        System.out.println("Kurs ismi : "+ this.name);
        System.out.println("Tamamlama yuzdesi : %" + tamamlama);
        System.out.println("Egitmen ismi : "+ this.teacher);
        System.out.println("*********************");
    }
    
    	

}
