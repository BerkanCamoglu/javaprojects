import java.util.Scanner;

public class AralikPozTamSayi {

	public static void main(String[] args) {
		
		boolean durum = true ;
		int top=0 , sayac=0 , altDeger , ustDeger ;
		Scanner in = new Scanner (System.in);
		do {
			
			System.out.print("Alt Degeri Giriniz : ");
			altDeger=in.nextInt();
			if(altDeger>=0)
				durum = false;
			else 
				System.err.printf("\nPozitif Sayi Lutfen");
		} while(durum);
		
		
	do {
			
			System.out.print("Üst Degeri Giriniz : ");
			ustDeger=in.nextInt();
			if(ustDeger>=0 && ustDeger>=altDeger)
				durum = false;
			else 
				System.err.printf("\nPozitif Sayi Lutfen");
		} while(durum);
		in.close();
		altDeger++;
      while (altDeger<ustDeger) {
    	  
    	 top= top + altDeger ;
    		  sayac++;
    		  altDeger++; 
    	 }  
     
    	  System.out.println("Toplam = " + top);
    	  System.out.println("Sayi Adet  = " + sayac);
	}

}
