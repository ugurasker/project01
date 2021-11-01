package firstpackage;

public class YediOTuzIki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 5, 2, 9, 3, 6, 8, 1, 2, 4 };
		//int[] list= {10,1,5,16,61,9,11,1,5,9};
		int[] parArr = partition(list);
		for (int each : parArr) {
			System.out.print(each+" ");
		}
	}

	public static int[] partition(int[] list) {
		int index = 0;
		int i = 1;
		

		for (int j = 1; j < list.length; j++) {
			if (list[index] > list[j]) {
				swap(list, i, j);
					i++;
			} 
		}
		System.out.println("i:" + i+ "index:" + index);
		
		if (list[--i] < list[index]) {
			swap(list, i, index);
		}

		return list;

	}

	public static void swap(int[] list, int a, int b) {

		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
}
