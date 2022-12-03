import java.util.Random;
import java.util.Scanner;

public class Toplam_Dizi2D02 {

	public static void main(String[] args) {
		int i, j ;
		int  satirA , sutunA, satirB , sutunB ;
		Random rand = new Random() ;
		Scanner in = new Scanner (System.in);
//    A MATR�S SATIR SAYISI 
		System.out.printf("A matris i�in  ");
    do {
    	System.out.printf("%nSatir : ");
    	satirA = in.nextInt();
    	if (satirA > 0)
    		break;
    	else
    		System.out.printf("Pozitif Tamsayi Giriniz");
   
    } while(true) ;
//  A MATR�S SUTUN SAYISI 		
  do {
  	System.out.printf("Sutun : ");
  	sutunA = in.nextInt();
  	if (sutunA > 0)
  		break;
  	else
  		System.out.printf("Pozitif Tamsayi Giriniz");
 
  } while(true) ;
    
    int [][] arrayA = new int [satirA][sutunA] ;
    
//  B MATR�S SATIR SAYISI 
		System.out.printf("B matris i�in  ");
  do {
  	System.out.printf("%nSatir : ");
  	satirB = in.nextInt();
  	if (satirB > 0)
  		break;
  	else
  		System.out.printf("Pozitif Tamsayi Giriniz");
 
  } while(true) ;
//B MATR�S SUTUN SAYISI 		
do {
	System.out.printf("Sutun : ");
	sutunB = in.nextInt();
	if (sutunB > 0)
		break;
	else
		System.out.printf("Pozitif Tamsayi Giriniz");

} while(true) ;
  
  int [][] arrayB = new int [satirB][sutunB] ;
  //A Matris Elemanlar� bulma
   for ( i = 0; i < arrayA.length; i++) {	   
	   for ( j = 0; j < arrayA[i].length; j++) {
		    arrayA[i][j] = rand.nextInt((9-1)+1) +1;
		   
	}
	
}
 // A Matris Elemanlar� yazma 
   
   System.out.printf("%nA Matris Elemanlar� :%n ");
   for (int[] dizi_1D : arrayA) {
	for (int veri : dizi_1D) {
		System.out.printf(" %d  " , veri);
	}
  }
   
   
   //B Matris Elamnlar� 
   for ( i = 0; i < arrayB.length; i++) {	   
	   for ( j = 0; j < arrayB[i].length; j++) {
		    arrayB[i][j] = rand.nextInt((9-1)+1) +1; 
	}
}
   
// B Matris Elemanlar�
   
   System.out.printf("%nB Matris Elemanlar� : %n");
   for (int[] dizi_1D : arrayA) {
	for (int veri : dizi_1D) {
		System.out.printf(" %d  " , veri);
	}
  }
   
   
  if (satirA==satirB && sutunA == sutunB) {
	  
	  int [][] arrayC = new int [satirA][sutunA]; 
	  
	  for ( i = 0; i < arrayA.length; i++) {	   
		   for ( j = 0; j < arrayA[i].length; j++) {
			   
			   arrayC[i][j] = arrayA[i][j] + arrayB[i][j] ;
		}	
	}	
	  // C Matris Yazma
      System.out.printf("%nC Matris Elemanlar� :%n");
      for (int[] dizi_1D : arrayC) {
   		for (int veri : dizi_1D) {
   			System.out.printf(" %2d  " , veri);
  
  }  
      }
   
	}
  else {
	  System.out.println("Satir S�t�n Uyusmuyor");
 }

 	  }
	}

