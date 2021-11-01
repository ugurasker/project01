package firstpackage;

import java.util.Scanner;

public class On_Yedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Account [] acc = new Account[10];
			for (int i=0; i <10; i++) {
				 acc[i] = new Account (i,100);
			}
			runner (acc);
	}
		public static void runner (Account [] acc) {
			System.out.println("Enter Id");
			Scanner input =new Scanner(System.in);
			int gir= input.nextInt();
			while ( gir>=0 && gir<=10) {
			  switch(Menu()) {
			  case 1: {
				  System.out.println("your balance is "+ acc[gir].getBalance());
			              break;
			  }
			  case 2: {
				     System.out.println("enter amount to withdraw");
				     Scanner scan = new Scanner(System.in);
				     int wamount = scan.nextInt();
				     System.out.println("your balance is "+ acc[gir].withdraw(wamount));
				     break;
			  }
			  case 3: {
				  System.out.println("enter amount to deposit");
				     Scanner scan = new Scanner(System.in);
				     int damount = scan.nextInt();
				     System.out.println("your balance is "+acc[gir].deposit(damount));
				     break;
			  }
			  case 4:  runner(acc);
			  
			  }
			}
			
	}
   public static int Menu () {
	   System.out.println();
	   System.out.println("Main Menu");
	   System.out.println("1:check balance");
	   System.out.println("2:withdraw");
	   System.out.println("3:deposit");
	   System.out.println("4:exit");
	   System.out.println("Enter Your Choice");
	   Scanner input = new Scanner(System.in);
	   int secim = input.nextInt();
	   return secim;
   }
}
