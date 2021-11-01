package firstpackage;

public class FirstClass {

	public static void main(String[] args) {
			prime();
	}
	public static void prime() {
		int count, temp;
		temp = 0;
		for (int number = 12; number < 100; number++) {
			count = 0;
			for (int i = 2; i < number; i++) {
				int a = reverse(number);
				
						if (a>i || a == 2) {
				if (number % i == 0 || a % i == 0) {

					count++;
					break;
				} 
				}
			} 
				if (count == 0) {
				System.out.print(number + " ");
				temp++;
				if (temp % 10 == 0) {
					System.out.println();
}}}}

	public static int reverse(int n) {
		int r, sum;
		sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}
		
		return sum;
		
	}
}
