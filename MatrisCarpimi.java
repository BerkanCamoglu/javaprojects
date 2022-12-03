import java.util.Random;
import java.util.Scanner;

public class MatrisCarpimi {

	public static void main(String[] args) {
		
		int  satirA , sutunA  , satirB , sutunB ,satirC , sutunC;
		
		Random rand = new Random ();
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("A Matrisin  Satir : ");
			satirA = input.nextInt();
			if (satirA>0)
				break ;
			else
				System.out.println("Pozitif Tamsayi Giriniz !!");
		} while (true) ;
		
		do {
			System.out.println("Matris Sütun  : ");
			sutunA = input.nextInt();
			if (sutunA>0)
				break ;
			else
				System.out.println("Pozitif Tamsayi Giriniz !!");
		} while (true) ;
		
		int [][] matrisA = new int[satirA][sutunA];
		
		for ( satirA = 0; satirA < matrisA.length; satirA++) {
			for ( sutunA = 0; sutunA < matrisA[satirA].length; sutunA++) {
				matrisA [satirA][sutunA] = rand.nextInt((9-1)+1)+1;
			}		
			} 
		System.out.printf("%nA Matris Elemanlarý : %n ");
		for (int[] dizi_1D : matrisA) {
			for(int veri : dizi_1D) {
				System.out.printf("%4d" , veri);
			}
			System.out.println();
		}
		//
		do {
			System.out.println("B Matrisin  Satir : ");
			satirB = input.nextInt();
			if (satirB>0)
				break ;
			else
				System.out.println("Pozitif Tamsayi Giriniz !!");
		} while (true) ;
		
		do {
			System.out.println("B Matris Sütun  : ");
			sutunB = input.nextInt();
			if (sutunB>0)
				break ;
			else
				System.out.println("Pozitif Tamsayi Giriniz !!");
		} while (true) ;
		
		int [][] matrisB = new int[satirB][sutunB];
		
		for ( satirB = 0; satirB < matrisA.length; satirB++) {
			for ( sutunB = 0; sutunB < matrisA[satirB].length; sutunB++) {
				matrisA [satirB][sutunB] = rand.nextInt((9-1)+1)+1;
			}
			} 
		System.out.printf("%nB Matris Elemanlarý : %n ");
		for (int[] dizi_1D : matrisA) {
			for(int veri : dizi_1D) {
				System.out.printf("%4d" , veri);
	      }
			System.out.println();
		  }
		if(satirA==sutunB) {
			int [][] matrisC = new int[sutunA][satirB];
			satirC=satirA;
			sutunC =sutunB;
			
			for ( satirC = 0; satirC < matrisC.length; satirC++) {
				for ( sutunC = 0; sutunC < matrisC[satirC].length; sutunC++) {
					matrisC[satirC][sutunC]=0 ;
					for (int i = 0; i < matrisB.length; i++) {
		       matrisC [sutunC][satirC] += matrisA[satirC][i] * matrisB[i][sutunC];	
		       
					} 
				}
			}
			System.out.printf("%nC Matris Elemanlarý : %n ");
			for (int[] dizi_1D : matrisC) {
				for(int veri : dizi_1D) {
					System.out.printf("%4d" , veri);
         }	
       } 
     }
   }  
 }
