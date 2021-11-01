package firstpackage;

import java.util.Scanner;

public class Alti_Otuzalti {
	 
	public static void main(String[] args) {
		System.out.println("kenar sayisi giriniz");
		 Scanner input= new Scanner(System.in);
		 int kenar= input.nextInt();
		 System.out.println("kenar uzunlugu giriniz");
		 Scanner input2= new Scanner(System.in);
		 double length= input2.nextDouble();
		 
	     System.out.println( area (kenar,length));
		
		
	}
	public static double area(int n, double s) {
		 
		
		  double ar = n * s * s /(4 * Math.tan (Math.PI/n)) ;
		  
		  return ar;
	}
	

}
