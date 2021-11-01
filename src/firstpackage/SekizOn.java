package firstpackage;

public class SekizOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][]mat = new int[4][4];
		  
		 for (int i=0;i<4;i++) {
			 for (int j=0;j<4;j++) {
				 mat[i][j]= (int) (Math.random()*10%2);
			 }
		 }
		 for (int i=0;i<4;i++) {
			 for (int j=0;j<4;j++) {
			System.out.print( mat[i][j]);
			 }
			 System.out.println();
		 }
		 int maxRow=0;
		 int maxCol=0;
		 for (int i=0;i<4;i++) {
			 int sum=0;
			 int mus=0;
			 
			 for (int j=0;j<4;j++) {
				 sum += mat[i][j];
				 mus += mat[j][i];
				 
			 }
			      if (sum>maxRow) {
			    	  maxRow=sum;}
			      if (mus>maxCol) {
			          maxCol=mus;  }
			 }
		 
		 System.out.println(maxRow+" "+maxCol);
	}

}
