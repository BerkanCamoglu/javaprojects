
import java.util.Scanner;

public class BagdasikSayi00 {

	public static void main(String[] args) {
		boolean durum = true ;
		int sayi1 , sayi2 , sayiBir;
		
		
		
		     Scanner in = new Scanner (System.in);
		do {
			
			System.out.print("Birinci Sayiyi Giriniz : ");
			sayi1=in.nextInt();
			in.close();
			if(sayi1>=10 && sayi1<=99)
				durum = false;
			else 
				System.err.printf("\nİki Basamakti tamsayi giriniz");
		} while(durum);
		
		do {
			
			System.out.print("Ikinci sayiyi giriniz : ");
			sayi2=in.nextInt();
			if(sayi2>=10 && sayi2<=99)
				durum = false;
			else 
				System.err.printf("\nIki basamakli tamsayi giriniz");
		} while(durum);
		
		sayiBir =sayi1 %10 +sayi2 %10 ;
		
		if (sayiBir==10) {
			
			if((sayi1-sayi1%10) == (sayi2 - sayi2 % 10)) {
				
				System.out.println("Bagdasik Sayilar");
			} 
			
			} else {
			System.out.println("Bagdasik Sayilar Degil");
			
		}
		

	}

}
