package firstpackage;

import java.util.Scanner;

public class YediYirmiSekiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter 5 numbers");
		int[] numbers = new int[5];
		for(int i=0;i<numbers.length; i++) {
		Scanner input = new Scanner(System.in);
		   numbers[i]=input.nextInt();
	}
		combinations(numbers);
	}
		public static void combinations(int[]numbers) {
			for(int i=0;i<numbers.length;i++) {
				for (int j=i+1;j<numbers.length;j++) {
					System.out.println(numbers[i]+" "+numbers[j]);
				}
			}
		}

}
