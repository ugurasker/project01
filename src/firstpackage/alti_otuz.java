package firstpackage;

import java.util.Random;

public class alti_otuz {
	public static void main(String[] args) {
		
		
		int roll = kumar();
		int a = result(roll);
	
        if (a==1) {
        	System.out.println(roll+ " fuck you ");
        	
        }else if (a==2) {
        	System.out.println(roll +" lucky bastard");
        }else if (a==3) {
        	System.out.println("you rolled "+roll+" roll again");
        	 int dene = 0;
        	 
        	while( dene != 7) {
        		 dene=kumar();
        		System.out.println("You rolled a " + dene);
                if (dene == roll) {
                    System.out.println("You Win!");
                    break;
                } else if (dene == 7) {
                    System.out.println("You loose!");
                    break;
                }
        	}
        }
		
		
	}	
		
		public static int kumar() {
		
		Random rand1 = new Random();
		int max=6 ;
		int zar1 = rand1.nextInt(max)+1 ;
		Random rand2 = new Random();
		int max2=6 ;
		int zar2 = rand2.nextInt(max2)+1;
		return zar2+zar1;
		} 
		
		public static int result(int roll) {
		 if (roll == 2 || roll == 3 || roll == 12) {
	            return 1 ;
	        } else if (roll == 7 || roll == 11) {
	            return 2;
	        }
	        return 3;
		
	}
}

