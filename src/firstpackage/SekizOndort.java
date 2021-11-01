package firstpackage;

import java.util.Scanner;

public class SekizOndort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of a square matrix");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[][] array = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = (int) (Math.random() * 10) % 2;
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		search(array, 0, 1);

	}

	public static void search(int[][] array, int number, int number1) {
		int counterR0 = 0;
		int counterC0 = 0;
		int counterR1 = 0;
		int counterC1 = 0;
		int counterX = array.length * 2;
		int counterY = array.length * 2;
		int counterD=0;
		int counterD1=0;
		int counterS=0;
		int counterS1=0;
		
		for (int i = 0; i < array.length; i++) {
			counterR0 = 0;
			counterC0 = 0;
			counterR1 = 0;
			counterC1 = 0;
			   if (array[i][i]== number)
				   counterD++;
			   if (array[i][i]== number1)
				   counterD1++;

			for (int j = 0; j < array.length; j++) {
				if (array[i][j] == number)
					counterR0++;
				if (array[i][j] == number1)
					counterR1++;

				if (array[j][i] == number)
					counterC0++;
				if (array[j][i] == number1)
					counterC1++;
				
				
			}
			if (counterR0 == array.length) {
				counterX--;
				System.out.println("All" + number + "s in row" + i);
			}
			if (counterR1 == array.length) {
				counterX--;
				System.out.println("All" + number1 + "s in row" + i);

			}

			if (counterC0 == array.length) {
				counterY--;
				System.out.println("All" + number + "s in column" + i);

			}
			if (counterC1 == array.length) {
				counterY--;
				System.out.println("All" + number1 + "s in column" + i);

			}
		}
		if (counterX == array.length * 2)

			System.out.println("rows empty");

		if (counterY == array.length * 2)

			System.out.println("cols empty");
		
		if (counterD == array.length) 
		
			System.out.println("All" + number + "s in diagonal");
		if (counterD1 == array.length) 
			
			System.out.println("All" + number1 + "s in diagonal");
		
		for (int i=1; i<array.length;i++) {
			if (array[i][i-1]==number)
				counterS++;
			if (array[i][i-1]==number1)
				counterS1++;
		}
		if (counterS == array.length-1) 
			
			System.out.println("All" + number + "s in subdiagonal");
		if (counterS1 == array.length-1) 
			
			System.out.println("All" + number1 + "s in subdiagonal");


	}

}
