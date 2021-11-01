package firstpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class den2 {
	public static void main (String[] args) {
	
      int [] arr = {2,4,7,5,4,3,2,1};
      int i=0;
      int k= arr.length-1;
        
    	  while ( i<k && arr[i]<arr[i+1] ) {
    		  i++;
    	  } 
    	  
    	  while (k>0 && arr[k]<arr[k-1]) {
    		  k--;
    	  }
    	  
    	  if (i==k && k!=arr.length-1 && i!=0) {
    		  System.out.println("mountain");
    	  } else {
    		  System.out.println("degil");
    	  }
      
	 
}
}