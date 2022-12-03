public class BagdasikSayi2 {

	public static void main(String[] args) {

		int birBasamak, i , j ;
		
		for (i=10 ; i <=99 ; i++) {
			
			for (j=10; j<=99 ; j++) {
				
				birBasamak = i % 10 + j % 10;
				if (i%10 > 5 ) {
			    break;
				}
				if (birBasamak == 10 ) {
					
					if ((i -i % 10)==(j - j % 10)) {
						System.out.printf("%n%d ve %d" , i , j);
					}
				}
				
				
			}
		}
		
		//87.sayfada kaldý
		
		

		}
		

	}

