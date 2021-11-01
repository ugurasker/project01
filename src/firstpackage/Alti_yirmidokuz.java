package firstpackage;

public class Alti_yirmidokuz {
	
	public static void main(String[] args) {
		
	
	for(double p=2; p<=31; p++) {
		int a =(int) Math.pow(2, p) - 1;
		   if (prime(a)) {
			   int k = (int) p;
			   System.out.println(k+" "+a);
	}
		
	}
	
	}
	public static boolean prime(int n) {
		for(int i=2; i<n; i++) {
			if (n % i == 0) {
				return false;
			} 
			}
		return true;
		}
	
	}


