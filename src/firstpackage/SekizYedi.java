package firstpackage;

public class SekizYedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
				 {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
				 {5.5, 4, -0.5}};
		
		int o1=0;
		int o2=1;
		double minDist= distance(points[o1][0],points[o1][1],points[o1][2],points[o2][0],points[o2][1],points[o2][2]);
					
		for(int i=0;i<points.length;i++) {
			for(int j=i+1; j<points.length;j++) {
				double dist = distance(points[i][0],points[i][1],points[i][2],points[j][0],points[j][1],points[j][2]);
				    
				if (minDist>dist) {
					o1=i;
					o2=j;
					minDist=dist;
					
				}
			}
			
		}
		System.out.println("shortest distance is between these 2 points"+points[o1][0]+" "+points[o1][1]+" "+points[o1][2]+" and "
				+points[o2][0]+" "+points[o2][1]+" "+points[o2][2]);
	}
	public static double distance(double x1,double y1 ,double z1,double x2,double y2,double z2) {
		double minDist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));
		return minDist;
	}

}
