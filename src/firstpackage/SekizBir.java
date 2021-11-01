package firstpackage;

public class SekizBir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][]m = {
    	   {1, 2, 3, 4, 5, 6, 7},
    	   {8, 9, 10, 11, 12, 13, 14},
    	   {15, 16, 17, 18, 19, 20, 21},
    	   };   
       
       int k= sumColumn(m,1);
       System.out.println(k);
	}
   public static int sumColumn (int [][] m, int colInd) {
	   int sum=0;
	   for (int j=0; j<m[colInd].length;j++) {
		   sum += m[colInd][j];
	   }
	   return sum;
	   
   }
}
