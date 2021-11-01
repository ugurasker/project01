package firstpackage;

import java.util.Scanner;

public class SekizDokuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] xo = new char[3][3];
		printboard(xo, ' ', 0, 0);
		int totalMoves = 9;
		while (totalMoves > 0) {
			System.out.println("Enter a row");
			Scanner input = new Scanner(System.in);
			int rowNum = input.nextInt();
			System.out.println("Enter a column");
			int colNum = input.nextInt();
			if (isEmpty(xo, rowNum, colNum)) {

				if (totalMoves % 2 == 1) {
					printboard(xo, 'x', rowNum, colNum);
					if (isWinner(xo, 'x'))
						break;
				} else {
					printboard(xo, 'o', rowNum, colNum);
					if (isWinner(xo, 'o'))
						break;
				}
				totalMoves--;
			} else {
				System.out.println("box is full, try again");
			}

		}

	}

	public static boolean isEmpty(char[][] xo, int rowNum, int colNum) {
		if (xo[rowNum][colNum] == 'x' || xo[rowNum][colNum] == 'o')
			return false;
		else
			return true;

	}

	public static void printboard(char[][] xo, char k, int rowNum, int colNum) {
		xo[rowNum][colNum] = k;
		for (int i = 0; i < 3; i++) {
			System.out.println();
			System.out.println("--------------");

			for (int j = 0; j < 3; j++) {

				if (j == 0) {

					System.out.print("| ");

				}
				System.out.print(" " + xo[i][j] + " | ");

			}

		}
		System.out.println();
		System.out.println("--------------");
	}

	public static boolean isWinner(char[][] xo, char k) {

		for (int i = 0; i < 3; i++) {
			if (xo[i][0] == k && xo[i][1] == k && xo[i][2] == k) {
				System.out.println("Player " + k + " wins.");
				return true;
			}
			if (xo[0][i] == k && xo[1][i] == k && xo[2][i] == k) {
				System.out.println("Player " + k + " wins.");
				return true;
			}
		}
		if (xo[0][0] == k && xo[1][1] == k && xo[2][2] == k) {
			System.out.println("Player " + k + " wins.");
			return true;
		}
		if (xo[0][2] == k && xo[1][1] == k && xo[2][0] == k) {
			System.out.println("Player " + k + " wins.");
			return true;
		}
		return false;
	}

}
