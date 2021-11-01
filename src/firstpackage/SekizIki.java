package firstpackage;

public class SekizIki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]m = {
		    	   {1, 2, 3,4 },
		    	   {8, 9, 10,11 },
		    	   {15, 16, 17,18},
		    	   {19,20,21,22}
		    	   }; 
		System.out.println(sumMajorDiagonal(m));   
	}
	public static int sumMajorDiagonal(int[][] m) {
		int j=0;
		int sum=0;
		for (int i=0;i<m.length;i++) {
			j=i;
			sum += m[i][j];
		}
		  return sum;
		
		
	}
}
