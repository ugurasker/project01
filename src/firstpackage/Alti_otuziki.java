package firstpackage;

public class Alti_otuziki {
	 public static void main(String[] args) {
		 int count = 0;
		 for (int i=1; i<5 ; i++) {
			 int n = zar();
			 
			 
		
		  if ( n ==2 || n == 3 || n == 12) {
			 
			  System.out.println(n+ "You loose!");
				
			 }else if (n == 7 || n == 11) {
				 System.out.println(n+ "You Win!");
				 count++;
			 }else  {
				  int point = n;
				  int rolling = 0;
				 while (rolling != 7) {
		                rolling = zar();
		                
		                if (rolling == point) {
		                    System.out.println( rolling+"You Win!");
		                    count++;
		                    break;
		                } else if (rolling == 7) {
		                    System.out.println( rolling+ "You loose!");
		                    ;
		                    break;
		                } else  { 
		                	    System.out.print("initial role is "+point);
		                    	System.out.print(" "+rolling+" roll again ");
		                    
		                    }
		                }}
				 }
			 
		 System.out.println("win count is "+count);
			 }
	 
		
		 
		 
		 public static int zar() {
		 
		 int zar1 = (int) (1+Math.random()*6);
		 int zar2 = (int) (1+Math.random()*6);
		  return zar1+zar2;
		 
		 
		 
		 
	 }
	 }
	
