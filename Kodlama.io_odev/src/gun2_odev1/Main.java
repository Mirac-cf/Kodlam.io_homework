package gun2_odev1;

public class Main {

	public static void main(String[] args) {
		
		Kurs kurs1 = new Kurs("java",88,"Engin Demirog");
	    Kurs kurs2 = new Kurs("C#",10,"Engin Demirog");
	    Kurs kurs3 = new Kurs("Programlamaya giris",30,"Engin Demirog");
	        
	        
	    System.out.println(kurs3.getName());
	    kurs1.kursSec(kurs1.getName());
	    kurs2.bilgileriGoster();
	        
	        
	    Work work = new Work();
	        
	    System.out.println("");
	    work.goToHomework(kurs1.getName());

	}

}
