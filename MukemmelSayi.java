import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args) {
		
		int toplam = 0 , sayi , sayac ;
		boolean durum=true ;
		Scanner input = new Scanner (System.in);
	do {
			
			System.out.print("Sayi Giriniz : ");
		    sayi=input.nextInt();
			if(sayi >0) {
				durum = false;
			}
				else {
					System.err.printf("Hatali Girriissss");
				}
			
		} while(durum);
		
	input.close();
		for (sayac = 1; sayac<sayi; sayac++) {
			
			if(sayi%sayac==0) {
				
				toplam +=sayac ; 
				
			}
			
			
		}
		
		if (toplam==sayi) {
			System.out.print(sayi + " ---> Mükemmel Sayi ");
		} else {
			
			System.out.print(sayi + " ---> Mükemmel Sayi Degil");
			
		}
		
		
		
	}

}
