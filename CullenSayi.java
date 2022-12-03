import java.util.Scanner;

public class CullenSayi {

	public static void main(String[] args) {
		boolean durum = true ;
		double sayac = 0.;
		int  sayi , cullenSayi ; 
		
		Scanner input = new Scanner (System.in);
		
		do {
	     System.out.println("Sayi Giriniz : ");
		 sayi = input.nextInt();
		 if (sayi>=1) {
			 durum = false ;
			
		 }  else {
			 System.out.printf("%n Pozitif tam sayi giriniz!!!!!");
		 }
 		
		} while(durum);
		input.close();
		
		
		
		do {
			sayac++;
			cullenSayi = (int) (sayac * Math.pow(2,sayac) + 1);
			if (cullenSayi == sayi) {
				
			    System.out.println(sayi + " Cullen Sayisidir.");
			    break;
			} else if (cullenSayi > sayi) {
				
				System.out.println(sayi + " Cullen Sayisi deðildir");
				break;
			}
	
		} while(cullenSayi < sayi);
			
		
	}
}
