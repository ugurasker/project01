package firstpackage;

public class YediYirmiDokuz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]cards= new int [52];
		for(int i=0;i<cards.length; i++) {
			cards[i]=i;
		}
	     for(int j=0;j<cards.length; j++) {
			int index= (int)(Math.random()*52);
			int temp= cards[j];
			cards[j]= cards[index];
			cards[index]=temp;
	     }
	    
	    	
	    
	     String[] suit= {"Spades","Clubs","Hearts","Diamonds"};
	     String[] rank= {"Zero","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	     int[] value = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	     
	     int a=0;
	    
	     int count=0;
	     while(a<48) {
	    	int sum=0;
	     for(int i=a; i<a+4; i++) {
	    	 
	    	 String rankDeger= rank[(cards[i]%13)+1];
	    	 String suitDeger= suit[cards[i]/13];
	    	System.out.println("Selected card is "+rankDeger+" of "+suitDeger);
	    	
	    	sum+= value[(cards[i]%13)+1];
	    	
	     }
	     a+=4;
	     System.out.println("Sum is "+sum);
	     if (sum==24) {
	    	 count++;
	     }
	     
	     }
	     
	     System.out.println("number of sums equal to 24: "+count);
	     
	     
	}
	
}
