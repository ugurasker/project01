package firstpackage;

public class SekizSekiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] points = { { 0, 0 }, { 1, 1 }, { -1, -1 }, { 2, 2 }, { -2, -2 }, { 3, 3 }, { 4, 4 } };

		int o1 = 0;
		int o2 = 1;
		double minDist = distance(points[o1][0], points[o1][1], points[o2][0], points[o2][1]);
		int counter = 0;
		while (counter < 2) {

			for (int i = 0; i < points.length; i++) {

				for (int j = i + 1; j < points.length; j++) {
					double dist = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
					if (counter == 0) {

						if (minDist > dist) {
							o1 = i;
							o2 = j;
							minDist = dist;
							System.out.println("girdim");
						}
					} else {
						if (minDist == dist) {
							System.out.println("The closest two points are (" + points[i][0] + "," + points[i][1]
									+ ") and (" + points[j][0] + ", " + points[j][1] + ")");
						}
					}

				}

			}
			counter++;
		}

		System.out.println(" and min distance is" + minDist);

	}

	public static double distance(int x1, int y1, int x2, int y2) {
		double minDist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return minDist;
	}
}
