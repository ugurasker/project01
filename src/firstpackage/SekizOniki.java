package firstpackage;

import java.util.Scanner;

public class SekizOniki {
	
	public static void main (String[] args) {
		
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		int[][] brackets = {
				 {8350, 33950, 82250, 171550, 372950}, // Single filer
				 {16700, 67900, 137050, 20885, 372950}, // Married jointly
				// -or qualifying widow(er)
				 {8350, 33950, 68525, 104425, 186475}, // Married separately
				 {11950, 45500, 117450, 190200, 372950} // Head of household
				};
	
		System.out.println("Enter ur status");
		Scanner input = new Scanner(System.in);
		int durum = input.nextInt();
		System.out.println("Enter ur income");
		Scanner input1 = new Scanner(System.in);
		int income = input.nextInt();
		 
		
		double vergi = brackets[0][0] * rates [0];
		for (int i=0; i<5; i++) {
	    if (i<4 && income > brackets[durum][i] && income < brackets[durum][i+1]) {
	    	vergi +=(income-brackets[durum][i])* rates[i+1];
	    	
	    } else if (income > brackets [durum][i]){
	    	if  (i==4) {
	    		vergi +=(income-brackets[durum][i])* rates[i+1];
	    	} else {
	    	vergi +=(brackets[durum][i+1]-brackets[durum][i])* rates[i+1];
	    	}
	    	
	    }
		}
		
		System.out.println(vergi);
		
	}

}
