package firstpackage;

public class SekizDort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] arr= {
					      {2,4,3,4,5,8,8},
					      {7,3,4,3,3,4,4},
					      {3,3,4,3,3,2,2},
					      {9,3,4,7,3,4,1},
					      {3,5,4,3,6,3,8},
					      {3,4,4,6,3,4,4},
					      {3,7,4,8,3,8,4},
					      {6,3,5,9,2,7,9}
					 };
			int[][] sums= new int[arr.length][2];
			for(int i=0;i<arr.length;i++) {
			   for (int j=0;j<arr[i].length;j++) {
					sums[i][1]+= arr[i][j];
					sums[i][0]=i;
				}
			}
			sortArr(sums);
	   }
	public static void sortArr(int[][]sums) {
		for (int i=0;i<sums.length-1;i++) {
			int curMin=sums[i][1];
			int curMinInd=i;
			int empNum=sums[i][0];
			for(int j=i+1;j<sums.length;j++) {
				if (curMin>sums[j][1]) {
					curMin=sums[j][1];
					curMinInd= j;
					empNum= sums[j][0];
					
				}
			}
			if (curMinInd != i) {
				
				sums[curMinInd][1]=sums[i][1];
				sums[i][1]=curMin;
				sums[curMinInd][0]=sums[i][0];
				sums[i][0]=empNum;
			}
		}
		for (int i=0; i<sums.length;i++) {
			for (int j=0; j<sums[i].length; j++) {
				System.out.print(sums[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
