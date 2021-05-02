package gun2_odev1;

import java.util.Scanner;


public class Work {
    
    public void kursSec(String name){
        System.out.println(name + " kursuna kayit yapildi.");
    }
  
    public void goToHomework(String name){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + " kursunun kacinci gunki odevine gitmek istiyorsunuz : ");
        
        int day = scanner.nextInt();
        
        System.out.println(name + " kursunun " + day + ". gununun odevine yonlendiriliyorsunuz...");
    }
    
}