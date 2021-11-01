package firstpackage;

import java.util.Scanner;

public class YediOtuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of values:");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] values = new int[size];
		System.out.println("enter the values");
		Scanner input1 = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			values[i] = input1.nextInt();
		}
		System.out.println(isConsecutiveFour(values));
	}

	public static boolean isConsecutiveFour(int[] values) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if( values.length-i<4) {
				return false;
			}
			for (int j = i + 1; j <values.length; j++) {
				if (values[i] == values[j]) {
					count++;
				}
				if (count == 4) {
					return true;
				}

			}
		}
         return false;
	}

}
