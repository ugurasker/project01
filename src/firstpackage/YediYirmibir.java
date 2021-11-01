package firstpackage;

import java.util.Arrays;
import java.util.Scanner;

public class YediYirmibir {
	public static void main(String[] args) {
		System.out.println("enter number of ballsssss");
		Scanner input = new Scanner(System.in);
		int numBall = input.nextInt();
		System.out.println("enter number of slotsss");
		Scanner input1 = new Scanner(System.in);
		int numSlots = input1.nextInt();
		int[] slots = new int[numSlots];
		numSlots--;
		for (int i = 0; i < numBall; i++) {
			char[] path = randomPath(numSlots);
			slots = drop(path, slots, i);
		}
		System.out.print(Arrays.toString(slots));
	}

	public static char[] randomPath(int numSlots) {
		char[] sonuc = new char[numSlots];
		for (int i = 0; i < numSlots; i++) {
			int temp = (int) (Math.random() * 2);
			sonuc[i] = (temp == 0) ? 'R' : 'L';
		}
		return sonuc;
	}

	public static int[] drop(char[] path, int[] slots, int i) {
		int count = 0;
		System.out.println("Ball " + i+1 + "goes " + Arrays.toString(path));
		for (char each : path) {
			if (each == 'R') {
				count++;
			}
		}
			System.out.println("Ball drops to slot " + (count + 1));
			slots[count]++;
            return slots;
	}

}
