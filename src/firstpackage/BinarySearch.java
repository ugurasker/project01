package firstpackage;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
    	int[] baby = {1,2,5,6,8,9};
    
    	Scanner input = new Scanner(System.in);
    	System.out.println("aradiginiz sayiyi giriniz: ");
    	int key = input.nextInt();
    	    
            System.out.println(binSearch(baby,key));
            }  
  
    public static int binSearch(int[] baby,int key){
    	int low = 0;
    	int high = baby.length - 1;
    	
    	while(high>=low) {
    		int mid = (low+high)/2;
    		if (key < baby[mid]) {
    			high = mid - 1;
    		}
    		else if ( key == baby[mid])
    			return mid;
    		else {
    			low = mid+1;
    		}
    		
    		}
     return -low-1;
    	    }

}
