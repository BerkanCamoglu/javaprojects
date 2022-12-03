import java.util.Scanner;
/* Ýstenilen Geometrik Þeklin Alan-Cevre-Hacim Hesabýný Yapan Program*/
/** BERKAN ÇAMOÐLU 
 * 2020141007
 * 20.01.2021
 */
public class AlanHacimCevreHesaplama {   
	public static void main(String[] args) {
	     int islem , islem1 , islem2 , islem3 ; 
	     double kisaKenar ,uzunKenar , kenar , r  , alan , taban , h , a, b, c , hacim;
	     final double PI = 3.1415926 ;  
		Scanner in = new Scanner (System.in);		
		System.out.println("  Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz : \n 1-Alan Hesabi \n 2-Cevre Hesabi \n 3-Hacim Hesabi  ");		
		 islem = in.nextInt();			
		 switch (islem) {	
		 case 1 : 
			System.out.println("\n 1-Kare \n 2-Cember \n 3-Dikdortgen \n 4-Ucgen  \n 5-Paralelkenar ");
			islem1=in.nextInt();	
			switch (islem1) {	
			case 1 :
				System.out.println("Kenar Uzunlugunu Giriniz : ");                //Alan Hesap Menüsü
			    kenar = in.nextDouble();
				alan = kenar*kenar;
				System.out.print("Alan = " + alan);
				break;
			case 2 : 
				System.out.println("Yaricap Uzunlugunu Giriniz : ");
			     r = in.nextInt();
				alan = (int) (PI*r*r);
				System.out.print("Alan = " + alan);	
				break;
			case 3 :
				System.out.println("Kisa Kenar Uzunlugunu Giriniz : ");
			    kisaKenar = in.nextDouble();
			    System.out.println("Uzun Kenar Uzunlugunu Giriniz : ");
			    uzunKenar = in.nextDouble();
				alan = kisaKenar*uzunKenar ;
				System.out.print("Alan = " + alan);
				break;
			case 4 : 
				System.out.println("Taban Uzunlugunu Giriniz : ");
			     taban = in.nextDouble();
			    System.out.println("Yuksekligi Giriniz : ");
				 h = in.nextDouble();
				 alan = taban*h/2;
				System.out.print("Alan = " + alan);	
				break;
			case 5 :	
				System.out.println("Herhangi Bir Kenar Uzunlugunu Giriniz : ");
			     taban = in.nextDouble();
			    System.out.println("Yuksekligi Giriniz : ");
				h = in.nextDouble();
				alan = h*taban;
				System.out.print("Alan = " + alan);	
				break;			
	      	}  
			break;	
		 case 2 :                                                                                            //Cevre Hesap Menüsü
		    System.out.println("\n 1-Kare \n 2-Cember \n 3-Dikdortgen \n 4-Ucgen  \n 5-Paralelkenar");
		    islem2=in.nextInt();
		    switch (islem2) {	    
		    case 1 :
				System.out.println("Kenar Uzunlugunu Giriniz : ");
			    kenar = in.nextDouble();
			    kareCevre(kenar);
				break;
			case 2 : 
				System.out.println("Yaricap Uzunlugunu Giriniz : ");
			     r = in.nextInt();
				cemberCevre(r,PI);				
				break;
			case 3 :
				System.out.println("Kisa Kenar Uzunlugunu Giriniz : ");
			    kisaKenar = in.nextDouble();
			    System.out.println("Uzun Kenar Uzunlugunu Giriniz : ");
			    uzunKenar = in.nextDouble();
				dikdortgenCevre(kisaKenar,uzunKenar);
				break;	
			case 4 : 
				System.out.println("1.Kenar Uzunlugunu Giriniz : ");
			     a = in.nextDouble();
			     System.out.println("2.Kenar Uzunlugunu Giriniz : ");
				 b = in.nextDouble();
				 System.out.println("3.Kenar Uzunlugunu Giriniz : ");
				 c = in.nextDouble();
				ucgenCevre(a,b,c);
				break;
			case 5 :	
				System.out.println("Ust - Alt Kenar Uzunlugunu Giriniz : ");
			     a = in.nextDouble();
			    System.out.println("Sag-Sol Kenar Uzunlugunu Giriniz :  ");
				 b = in.nextDouble();
				paralelCevre(a,b);
				break;
		   default : 
			   System.out.println(" ! Lütfen Dogru Ýslem Numarasý Giriniz ! ");
			   break;
		    } 
		    break;
		 case 3 :
			 System.out.println("\n 1-Küp \n 2-Küre \n 3-Dikdortgen Prizma \n 4-Dik Piramit  \n 5-Silindir \n 6-Dik Koni");
		 islem3 = in.nextInt();		   
		    switch(islem3) {				
				case 1 :
					System.out.println("Kenar Uzunlugunu Giriniz : ");                               //Hacim Hesap Menüsü
				    kenar = in.nextDouble();
					hacim = Math.pow(kenar, 3);
					System.out.print("Hacim = " +hacim);
					break;
				case 2 : 
					System.out.println("Yaricap Uzunlugunu Giriniz : ");
				    r = in.nextInt();
					hacim = 4/3*(Math.pow(r, 3))*PI;
					System.out.print("Hacim = " + hacim);	
					break;
				case 3 :
					System.out.println("Kenar Uzunlugunu Giriniz : ");
				    a = in.nextDouble();
				    System.out.println("Kenar Uzunlugunu Giriniz : ");
				    b = in.nextDouble();
				    System.out.println("Kenar Uzunlugunu Giriniz : ");
				    c = in.nextDouble();
					hacim = a*b*c ;
					System.out.print("Hacim = " +hacim);
					break;
				case 4 : 
					System.out.println("Kenar Uzunlugunu Giriniz : ");
				     a = in.nextDouble();
				    System.out.println("Yuksekligi Giriniz : ");
					 h = in.nextDouble();
					 hacim =1/3*a*a*h;
					System.out.print("Hacim = " + hacim);	
					break;
				case 5 :	
					System.out.println("Yaricap Uzunlugunu Giriniz : ");
				    r = in.nextDouble();
				    System.out.println("Yuksekligi Giriniz : ");
					h = in.nextDouble();
					hacim = PI*(Math.pow(r, 2))*h;
					System.out.print("Hacim = " + hacim);	
					break;
				case 6 :
					System.out.println("Yaricap Uzunlugunu Giriniz : ");
				    r = in.nextDouble();
				    System.out.println("Yuksekligi Giriniz : ");
					h = in.nextDouble();
					hacim =PI*(Math.pow(r, 2))*h/3;
					System.out.print("Hacim = " + hacim);	
					break;			
			   default : 
				   System.out.println(" ! Lütfen Dogru Ýslem Numarasý Giriniz ! ");
				   break;	    
		    } break;
			 }
		 in.close();
		 }
	public static void paralelCevre(double a, double b) {
		double cevre = (2*a) + (2*b);
		System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}
	public static void ucgenCevre(double a, double b, double c) {
		 double cevre = ( a + b + c);
		 System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}
	public static void dikdortgenCevre(double kisaKenar, double uzunKenar) {
		double cevre = (2*kisaKenar)+ (2*uzunKenar) ;
		System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}
	public static void cemberCevre(double r, double PI) {
		 double cevre = (PI*2*r);
		 System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}
	public static void kareCevre(double kenar) {		
		double cevre = 4*kenar ;
		System.out.printf("%nCevre = %.2f cm%n" , cevre);
	}	
	
	}
