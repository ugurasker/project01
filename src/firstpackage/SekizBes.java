package firstpackage;

import java.util.Scanner;

public class SekizBes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[][] mat1 = new int[3][3];
            int[][] mat2= new int[3][3];
            int[][]sum = new int[3][3];
            for(int i=1;i<3;i++) {
            	 System.out.println("enter matrix:"+i);
            	 Scanner input= new Scanner(System.in);
            	 
            	 for (int j=0;j<3;j++) {
            		 for(int k=0;k<3;k++) {
            			 int number= input.nextInt();
            			 if(i==1) {
            			 mat1[j][k]=number;
            		   } else {
            			   mat2[j][k]=number;
            		   }
            	 }
            }
        }
            for (int i=0; i<3;i++) {
            	for(int j=0;j<3;j++) {
            		sum[i][j]=mat1[i][j]+mat2[i][j];
            	}
            	
            }
            for (int i = 0; i < mat1.length; i++) {
            	for (int j = 0; j < mat1[i].length; j++) {

                    System.out.print(mat1[i][j] + " ");
                    if (i == 1 && j == 2) {
                        System.out.print(" +   ");
                    } else if (i != 1 && j == 2)
                        System.out.print("     ");
                }

                for (int j = 0; j < mat2[i].length; j++) {

                    System.out.print(mat2[i][j] + " ");
                    if (i == 1 && j == 2) {
                        System.out.print(" =   ");
                    } else if (i != 1 && j == 2)
                        System.out.print("     ");
                }

                for (int j = 0; j < sum[i].length; j++) {

                    System.out.print(sum[i][j] + " ");
                 
                }
                System.out.println();

            }         
}
}