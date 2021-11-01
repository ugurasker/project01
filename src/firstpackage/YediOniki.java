package firstpackage;

import java.util.Scanner;

public class YediOniki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] baby = new int[10];
             System.out.println("10 sayi girin");
             Scanner input = new Scanner(System.in);
             for (int i=0; i<10;i++) {
            	baby[i]=input.nextInt();
            	 
             }
            for (int each : reverser (baby)) {
            	System.out.print(each+ " ");
            }
             
             
	}
             public static int[] reverser(int[] baby) {
            	 int[] ters = new int[10];
            	 for(int j=0; j<10;j++) {
            		 ters[j]= baby[baby.length-1-j];
            	 }
            		return ters;
          }
             
          

}
