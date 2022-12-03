import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int sayi , adet = 1 ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.print("Terim Sayisini Giriniz : ");
		sayi = input.nextInt();
		
		do {
			System.out.print(fibonacciHesap(adet) +" ");
			adet++;
		} while (adet<= sayi);
		
		input.close();
	}

	public static int fibonacciHesap(int x) {
		if (x==0)
		   return 0 ;
	     else if (x==1)
			return 1;
		else
			return (fibonacciHesap (x-1) + fibonacciHesap(x-2));
	}

}
