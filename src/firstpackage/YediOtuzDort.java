package firstpackage;

public class YediOtuzDort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "paulina";
		
		System.out.println(sort(str));
		
	}
	
     public static String sort(String s) {
    	 int[] nums= new int[s.length()];
    	 for(int i=0;i<s.length();i++) {
    		nums[i]= s.charAt(i)-'a';
    		
     }
    
    	 String s1 = new String(sortArray(nums));
    	 return s1;
   
     }
     
    	 public static char[] sortArray(int[]nums) {
    		 for(int i=0; i<nums.length-1;i++) {
    			 int curMin= nums[i];
    			 int curMinInd=i;
    			 for(int j=i+1;j<nums.length;j++) {
    				 if(curMin>nums[j]) {
    					 curMin=nums[j];
    					 curMinInd=j;
    				 }
    			 }
    			 if (curMinInd != i) {
    				 nums[curMinInd] = nums[i];
    				 nums[i]= curMin;
    				 
    			 }
    		 }
    		
    		 char[] baby = new char[nums.length];
    		 for(int i=0;i<nums.length;i++) {
    			 baby[i] = (char)(nums[i]+'a');
    			 
    		 }
    		 return baby;
    	 }
    	 
    	 
    	 
     
}
