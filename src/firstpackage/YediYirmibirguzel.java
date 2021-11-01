package firstpackage;

import java.util.Scanner;

public class YediYirmibirguzel {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();
		String[] ballPaths = new String[numberOfBalls];

		System.out.print("Enter the number of slots in the bean machine: ");
		int numberOfSlots = input.nextInt();
		int[] slots = new int[numberOfSlots];

		// display ball paths
		for (int i = 0; i < numberOfBalls; i++) {
			ballPaths[i] = dropBall(slots);
			System.out.printf("%10s\n", ballPaths[i]);
		}

		// display game
		System.out.println("");
		printArray(slots, numberOfBalls);
	}

	public static String dropBall(int[] slot) {

		StringBuilder ballPath = new StringBuilder();

		for (int i = 0; i < slot.length - 1; i++) {
			int random = (int) (Math.random() * 10) % 2;
			if (random > 0)
				ballPath.append("R");
			else
				ballPath.append("L");
		}
		int position = getBallPosition(ballPath.toString(), 'R');
		slot[position]++;
		return ballPath.toString();

	}

	public static int getBallPosition(String str, char r) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == r)
				count++;

		}

		return count;
	}

	public static void printArray(int[] slots, int numberOfBalls) {

		while (!isEmpty(slots)) {

			if (isRowEmpty(slots, numberOfBalls)) {
				numberOfBalls--;
				continue;
			}
			for (int i = 0; i < slots.length; i++) {

				if (slots[i] >= numberOfBalls) {
					System.out.printf("%2c", 'O');
					slots[i]--;
				} else
					System.out.printf("%2c", ' ');

			}
			numberOfBalls--;
			System.out.println("");

		}

	}

	public static boolean isEmpty(int[] slots) {

		for (int slot : slots) {
			if (slot != 0) {
				return false;
			}
		}

		return true;
	}

	public static boolean isRowEmpty(int[] slots, int rowNum) {

		for (int slot : slots) {
			if (slot == rowNum) {
				return false;
			}
		}

		return true;
	}

}
