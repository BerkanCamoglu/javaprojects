import java.util.Scanner;

public class kokBulma {

	public static void main(String[] args) {
		double a , b , c , det = 0 , x1 = 0 , x2 = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.println("A degeri girin");
		a = in.nextDouble();
		
		System.out.println("B degeri girin");
		b = in.nextDouble();
		
		System.out.println("C degeri girin");
		c = in.nextDouble();
		
		in.close();
		
		if (a==0) {
			
			System.out.println("tek kok var :  " + (-c)/(b));
		
			
		}
		
		else {
			det = (b*(b-4)*a*c) ;
		}
		
		//calculates root
		
		x1 = (-b + sqrt(det))/(2*a);
		x2 = (-b - sqrt(det))/(2*a);
		
		if (det>=0) {
			System.out.println("reel kok var : " + "x1 : " + x1 + " x2 : " + x2);
			
			
		}
		
		else {
			System.out.println("sanal kok var : "+ "x1 : " + x1 + " x2 : " + x2);
			
		}
		
	}

	private static double sqrt(double det) {
		
		return 0;
	}

}
