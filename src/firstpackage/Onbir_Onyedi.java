package firstpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Onbir_Onyedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    ArrayList<Integer> carpanlar = new ArrayList<>();
		    ArrayList<Integer> unique= new ArrayList<> ();
		    ArrayList<Integer> evensremoved= new ArrayList<>();
		    
            System.out.println("enter a number");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
           
            int i=2;
            while (number >=i) {
            	if (number % i ==0) {
            	carpanlar.add(i);
            	number=number/i;
            } else {
            	i++;
            	
            }
            }
            for (int j=0; j<carpanlar.size(); j++) {
            	System.out.println(carpanlar.get(j));
            }
             for (int j=0; j<carpanlar.size();j++) {
            	if (!unique.contains(carpanlar.get(j))) {
            		unique.add(carpanlar.get(j));
            	}
             }
             System.out.println("uniqeeee");
             for (int j=0; j<unique.size(); j++) {
             	System.out.println(unique.get(j));
             }
             int count;
             for (int j=0; j<unique.size(); j++) {
            	 count=0;
             	for (int k=0; k<carpanlar.size();k++) {
             		if (unique.get(j)== carpanlar.get(k)) {
             			count++;
             		}
             	}
             	if (count == 1 || count%2 ==1) {
             		evensremoved.add(unique.get(j));
             	}
             }
             System.out.println("evens removed");
             for (int j=0; j<evensremoved.size(); j++) {
             	System.out.println(evensremoved.get(j));
             }
             int n=1;
             for (int j=0; j<evensremoved.size(); j++) {
              	n= n*evensremoved.get(j);
              }
             System.out.println("the smallest n for m*n to be perfect square "+n);
            
	}

}
