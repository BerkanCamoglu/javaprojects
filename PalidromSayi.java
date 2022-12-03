import java.util.Scanner;

public class PalidromSayi {

	public static void main(String[] args) {
		
		int yeniSayi=0 , sayi , temp , kalan ;
		boolean durum = true ;
		Scanner klavye = new Scanner (System.in);
		do {
			
				System.out.print("Sayma Sayisi Giriniz : "); 
			sayi = klavye.nextInt();
			if(sayi>=10)
			durum = false ;
		
		} while (durum);

			klavye.close();
		
		temp=sayi ; 
		while(temp>0) {
			kalan = temp %10;
			temp = temp/10;
			yeniSayi=yeniSayi*10+kalan;
			
		
	}
		if (yeniSayi==sayi)
			System.out.println(sayi + "Palidrom Sayisidir.");
		else 
			System.out.println(sayi + "Palidrom Deðil.");
	}

}

