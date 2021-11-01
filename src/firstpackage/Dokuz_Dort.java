package firstpackage;

import java.util.Random;

public class Dokuz_Dort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Random rand = new Random(1000);
           for (int i=0; i<50; i++) {
        	 int  sayi=rand.nextInt(100);
        	 System.out.println(sayi);
           }
	}

}
