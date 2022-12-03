import java.util.Random;
import java.util.Scanner;

public class DiziBuyKucHesap {

	public static void main(String[] args) {
		
		int boyut , i ;
		Random rand = new Random() ;
     	Scanner input = new Scanner (System.in);
		System.out.printf("Dizinin boyutunu giriniz : ");
		boyut = input.nextInt();
		input.close();
		
		int [] array = new int [boyut];
		
		for (i = 0 ; i < array.length ; i++) {
			array[i] = rand.nextInt((99-10)+1)+10 ;
		}
		
		yazdirma(array);
		System.out.printf("%nBuyuk = %2d" , buyukBul(array));
		kucukBul(array);
		System.out.printf("%nKucuk = %2d" , kucukBul(array));
	}
	
	public static void yazdirma (int[] array) {
		for (int veri : array) {
			System.out.printf("%2d " , veri);
		}

	}
	
	public static int buyukBul(int[] array ) {
		int i , buyuk = array [0];
		
		for (i = 1 ; i < array.length; ++i) {
			if (array [i] > buyuk) {
			 buyuk = array [i];
		}
	}
	   return buyuk ;
	}   
	   public static int kucukBul(int[] array ) {
			int i , kucuk = array [0];
			
			for (i = 1 ; i < array.length; ++i) {
				if (array [i] < kucuk ) {
				 kucuk = array [i];
			}
		}
		   return kucuk ;
		
}

}
