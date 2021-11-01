package firstpackage;

import java.util.Scanner;

public class SekizAlti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   double[][] mat1 = new double[3][3];
           double[][] mat2= new double[3][3];
           double[][] mult = new double[3][3];
           for(int i=1;i<3;i++) {
           	 System.out.println("enter matrix:"+i);
           	 Scanner input= new Scanner(System.in);
           	 
           	 for (int j=0;j<3;j++) {
           		 
           		 for(int k=0;k<3;k++) {
           			 
           			 double number= input.nextDouble();
           			 if(i==1) {
           			 mat1[j][k]=number;
           		   } else {
           			   mat2[j][k]=number;
           		   }
           	 }
           }
       }
        mult=multMat(mat1,mat2);
        print(mat1,mat2,mult);
	}
   public static double[][] multMat(double[][]mat1,double[][]mat2){
	   double[][]mult=new double[3][3];
	    for(int i=0;i<3;i++) {
	    	for (int j=0;j<3;j++) {
	    	mult[i][j]=mat1[i][0]*mat2[0][j]+mat1[i][1]*mat2[1][j]+mat1[i][2]*mat2[2][j];
	    	}
	    }
	   
	return mult;   
   }
   public static void print(double[][]mat1,double[][]mat2,double[][]mult) {
	   for (int i=0;i<3;i++) {
		   for (int j=0;j<3;j++) {
			   System.out.print(mat1[i][j]+" ");
			   if (i==1 &&j==2)
				System.out.print(" * ");
			   else if(i !=1 && j==2)
				System.out.print("   ");
		   }
		   for(int k=0;k<3;k++) {
			   System.out.print(mat2[i][k]+" ");
			   if (i==1 &&k==2)
				System.out.print(" = ");
			   else if(i !=1 && k==2)
				System.out.print("   ");
			   
		   }
		   for(int m=0;m<3;m++) {
			   System.out.print(mult[i][m]+" ");
			
	   }
		   System.out.println();
   }
}
}