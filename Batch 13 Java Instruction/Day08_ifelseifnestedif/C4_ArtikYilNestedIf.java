package Day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
		
		////Kullanicidan artik yil olup olmadigini kontrol 									
	 	//etmek icin yil girmesini isteyin.
					
		//Kural 1: 4 ile bolunemeyen yillar artik yil degildir
		//Kural 2: 4�un kati olmasina ragmen 100 ile 
		
         Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yil yaz�n�z");
	
		int yil= scan.nextInt();
		
		if (yil%100==0) { //y�ze b�l�nebiliyor
			
			if (yil%400==0) {
				System.out.println("Artik yil");
			} else {System.out.println("artik yil degil");

			}
			
		}else {// y�ze b�l�nemiyor

			if (yil%4==0) {
				System.out.println("Artik yil");
			} else {System.out.println("Artik yil degil");

			}
		
		
		}
		
		scan.close();
	}

}
