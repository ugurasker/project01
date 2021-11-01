package firstpackage;

public class YediYirmiuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []count = new int [100];
		int j;
		for (int i=1; i<101;i++) {
			j=i;
			while(j<101) {
				count[j-1]++;
				j= j+i;
			}
			
		}
		boolean [] lockers =display(count);
         for (boolean each:lockers) {
        	 System.out.println(each);
         }
        	 
         }
        	 
         
	
	public static boolean[] display(int[] count) {
		boolean[] lockers = new boolean[100];
		for (int i=0;i<100;i++) {
		if (count[i] % 2 == 0) {
			lockers [i] = true;
		} else {
			lockers[i] = false;
		}
	}
        return lockers;
}
}