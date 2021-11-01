package firstpackage;

public class YediYirmidort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int []cards = new int [52];
	 for(int i=0; i<52; i++) {
		 cards[i]=i;
		 }
	 String[] suits= {"Spades","Clubs","Hearts","Diamonds"};
	 String[] order ={"King","Ace","2","3","4","5","6","7","8","9","10","Jack","Queen"};
	 
	 for (int i=0;i<52;i++) {
		 int index= (int) (Math.random()*52);
		 int temp = cards[i];
		 cards[i] = cards[index];
		 cards[index]=temp;
	 }
	 int a,b,c,d,j;
	 a=b=c=d=j= 0;
	     while (a<1 || b<1 || c<1 || d<1) {
	    	if ( cards[j]/13 == 0) {
	    		a++;
	    		if (a==1) {
	    			System.out.println(suits[(cards[j]/13)]+" "+order[cards[j]%13]);
	    		}
	      } else if ( cards[j]/13 == 1) {
	    	    b++;
	    	    if (b==1) {
	    			System.out.println(suits[(cards[j]/13)]+" "+order[cards[j]%13]); }
	 } else if ( cards[j]/13 == 2) {
	 c++;
	 if (c==1) {
			System.out.println(suits[(cards[j]/13)]+" "+order[cards[j]%13]); }
	}else if ( cards[j]/13 == 3) {
		d++;
		if (d==1) {
			System.out.println(suits[(cards[j]/13)]+" "+order[cards[j]%13]); }
	}
	    	j++;
}
	     System.out.println("Numbers of picks is "+ (j+1));
		
	}	}     
