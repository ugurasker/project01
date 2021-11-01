package firstpackage;

import java.util.Scanner;

public class YediUC {
	public static void main (String[] args) {
	
	int [] baby = new int[100];
	System.out.println("Sayilari girin: ");
	Scanner input = new Scanner(System.in);
	int index = 0;
	int girdi;
	
		do {
			  girdi = input.nextInt();
			 baby[index] = girdi;
			 index++;
		 
	} while (girdi != 0);
		counter(baby);
		}
	
	
	public static void counter(int[] baby) {
		
		int []count = new int[100];
		for(int i=0; i<100; i++) {
			count[(baby[i]- 0)]++;
		}
		for (int j=0; j<100; j++) {
			if (j> 0 && count[j]>0) {
			System.out.println(j+ " "+count[j]);
			}
		}

	
	
	}
}



