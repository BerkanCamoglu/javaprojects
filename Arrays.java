import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int boyut ;
		
		Random rand = new Random();
		Scanner in = new Scanner (System.in);
		System.out.println("Dizinin Boyutunu Giriniz = ");
		boyut = in.nextInt();
		in.close();
		
		int[] dizi = new int[boyut];  //allocate
		
          for (int i=0 ; i<dizi.length; i++ ) {
        	  dizi[i] =rand.nextInt((99-10)+1)+10;
          }
          for (int i=0 ; i<dizi.length; i++ ) {
        	 System.out.print(dizi[i]+ " ");
          }
          
          
	}


}
