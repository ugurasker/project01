package firstpackage;

import java.util.Scanner;

public class SekizOnbir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int[3][3];
		int[] b = new int[9];
		System.out.println("enter a number between 0 and 511");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String str = Integer.toBinaryString(num);
		String rst = String.format("%9s", str).replaceAll(" ", "0");
		System.out.println(rst);
		int j = 0;
		for (int i = 0; i < rst.length(); i++) {
			j++;
			String a = rst.substring(i, j);

			b[i] = Integer.parseInt(a);

		}
		int counter = 0;
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 3; m++) {
				mat[k][m] = b[counter];
				counter++;

			}
		}
		for (int k = 0; k < 3; k++) {
			for (int m = 0; m < 3; m++) {
				if (mat[k][m] == 0)
					System.out.print("H" + " ");
				else
					System.out.print("T" + " ");
			}
			System.out.println();
		}
	}

}
