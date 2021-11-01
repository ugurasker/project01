package firstpackage;

import java.util.Scanner;

public class YediOnsekiz {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten decimal numbers:");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }

    public static void bubbleSort(double[] arr) {

        double temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

    }
}


