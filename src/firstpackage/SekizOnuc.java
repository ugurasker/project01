package firstpackage;

import java.util.Scanner;

public class SekizOnuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows and columns of array");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		int [][] array = new int [row][column];
		
		for (int i=0; i<row ; i++) {
			int j=0;
				System.out.print("enter the array");
				Scanner input1 = new Scanner(System.in);
				array[i][j]= input1.nextInt();
				array[i][j+1]= input1.nextInt();
				array[i][j+2]= input1.nextInt();
				array[i][j+3]= input1.nextInt();
			
			System.out.println();
		}
		 int max = 0;
		 int RowInd =0;
		 int ColInd = 0;
		for (int i=0; i<row ; i++) {
			for (int j =0; j<column; j++) {
				if (array [i][j]>max) {
					max = array [i][j];
					RowInd=i;
					ColInd=j;
				}
			}
			
		}
		System.out.println("largest element is at ("+RowInd+","+ColInd+")");


	}

}
