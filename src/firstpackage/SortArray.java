package firstpackage;

public class SortArray { 
	
	public static void main(String[] args) {
	int[] baby = { 2,9,5,4,8,1,6,7};
    
	
	for (int i=0; i<baby.length-1;i++) {
		int currentMin = baby[i];
		int curMinInd=i;
		for(int j=i+1; j<baby.length ;j++) {
			if(currentMin > baby [j]) {
				currentMin= baby[j];
				curMinInd=j;
			}
				
			}
		 if (curMinInd != i) {
			 baby[curMinInd] = baby[i];
			 baby[i]=currentMin;
		 }
		}
	for (int each : baby) {
	System.out.print(each+ " ");}
	
	}
}


