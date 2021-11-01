package firstpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Onbir_Onalti {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
        
		int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int sonuc = a+b;
        ArrayList<Integer> tahminler= new ArrayList<>();
        System.out.println("what is "+a+" + "+b+" ? ");
        
        Scanner input = new Scanner(System.in);
        int tahmin = input.nextInt();
        while (tahmin != sonuc) {
        	
        	if (tahminler.contains(tahmin)) {
        		System.out.println("you already entered "+tahmin);
        	}
        	 
        	System.out.println("wrong, try again."+" what is "+a+" + "+b+" ? ");
        	tahminler.add(tahmin);
            tahmin = input.nextInt();
        }
        System.out.println("you got it");
	}

}
