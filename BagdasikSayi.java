

public class BagdasikSayi {

	public static void main(String[] args) {

		int birBasamak, i , j ;
		
		for (i=10 ; i <=99 ; i++) {
			
			for (j=10; j<=99 ; j++) {
				
				birBasamak = i % 100 + j % 10;
				if (birBasamak == 10 ) {
					
					if ((i-i%10)==(j-j%10)) {
						System.out.printf("%n ve %d" , i , j);
					}
				}
				
				
			}
		}

		}
	}

