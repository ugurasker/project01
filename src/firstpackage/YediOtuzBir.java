package firstpackage;

public class YediOtuzBir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list1= {1,2,5,16,61,111};
		int [] list2= {2,4,5,6,28,112};
		
		int[]merged= merge(list1,list2);
		for (int each:merged) {
			System.out.print(each+" ");
		}
}
	public static int[] merge(int[]list1,int[]list2) {
		int size = list1.length + list2.length;
		int []merged = new int [size];
		int count=0;
		int j=0;
		int i=0;
		   while(i<list1.length && j<list2.length) {
				if (list1[i]<=list2[j]) {
					merged[count]=list1[i];
					i++;
				}else {
					merged[count]=list2[j];
					j++;
				}
				count++;
		   }
				while ( i<list1.length) {
					merged[count]=list1[i];
					count++;
					i++;
					
				}
				while(j<list2.length) {
					merged[count]=list2[j];
					count++;
					j++;
				}
			
		   
		return merged;
	}
}
