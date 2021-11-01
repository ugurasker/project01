package firstpackage;

import java.util.Scanner;

public class YediOnyedi {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("enter number of students");
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();

		String[] name = new String[k];
		String[] grade = new String[k];

		while (count < k) {
			System.out.println("enter student name / score");
			Scanner input1 = new Scanner(System.in);
			String gir = input1.next();
			String[] splited = new String[2];
			splited = gir.split("/");

			name[count] = splited[0];
			grade[count] = splited[1];
			count++;
		}
		int[] baby = new int[k];
		for (int i = 0; i < k; i++) {
			baby[i] = Integer.parseInt(grade[i]);
		}
		sorter(name, baby, k);
	}

	public static void sorter(String[] name, int[] baby, int k) {
		for (int i = 0; i < k - 1; i++) {
			int curMax = baby[i];
			int curInd = i;
			for (int j =i+1; j < k; j++) {
				if (curMax < baby[j]) {
					curMax = baby[j];
					curInd = j;
				}
			}
			if (curInd != i) {
				String temp = name[i];
				name[i] = name[curInd];
				name[curInd] = temp;
				baby[curInd] = baby[i];
				baby[i] = curMax;
			}
		}
		for (int m = 0; m < k; m++) {
			System.out.println(name[m] + baby[m]);

		}

	}
}
