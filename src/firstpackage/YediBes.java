package firstpackage;

import java.util.Scanner;

public class YediBes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] baby = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.println("10 sayi girin");
		for (int i = 0; i < 10; i++) {
			baby[i] = input.nextInt();
			}
		distinct(baby);
	}

	public static void distinct(int[] baby) {
		int count=0;
		int[] check = new int[10];
		for (int i = 0; i < 10; i++) {
			check[baby[i] - 0]++;
		}
			for(int j=0;j<10;j++) {
				
				if (check[j]>=1){
					count++;
					System.out.print(j+" ");
				
				}	
		   }
		  System.out.println(" ");
          System.out.println("distinct count is: "+ count);
		}

	}


