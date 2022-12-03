import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		
		double yaricap ;
		final double PI = 3.1415926;
		Scanner input = new Scanner (System.in);
		System.out.println("Yaricapi cm cinsinde giriniz = ");
		yaricap = input.nextDouble();
		input.close();

		System.out.printf("%nYaricap = %.2f cm %n", yaricap );
		cevreHesap(yaricap , PI);
		alanHesap(yaricap , PI);
	}

	
	public static void cevreHesap(double r , double PI) {
	
		double cevre =  2 * PI * r ;
		System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}

	public static void alanHesap(double r , double PI) {
		double alan = Math.pow(r, 2) * PI ;
	    System.out.printf("%nAlan = %.2f cm%n" , alan);
		
	}
}
