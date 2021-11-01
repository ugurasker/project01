package firstpackage;

import java.util.Scanner;

public class YediOtuzBes {
	public static void main(String[] args) {
		
		 runner();
		 
		}
		   public static void runner () {
				String[] words= {"tabtle","chair","television","cupboard","fridge"};
				int select = (int) (Math.random()*(words.length));
				int k= words[select].length();
				
				 char [] collect = new char[k];
				 char [] display = new char[k];
				 int missed=0;
				for (int i=0;i<k;i++) {
					collect[i]=words[select].charAt(i);
				  }
				for (int i=0;i<k;i++) {
					display[i]='*';
				}
				 
				for(char each:display) {
					System.out.print(each);
				} 
				while(control(display)) {
			 missed=check(collect,display,missed);
				}
			 System.out.println();
			 System.out.printf("You missed %d %s%n",missed, missed>1 ? " times":"time");
			 System.out.println("wanna play again? enter y or n");
			 Scanner input= new Scanner(System.in);
			 String girdi= input.next();
			  if (girdi.equals("y")) {
				  runner();
			  } else {
				  System.out.println("good bye!");
			  }
			
		   }
		public static int check(char[] collect,char[] display,int missed) {
			
		    System.out.println( "Enter your guess: ");
			Scanner input= new Scanner(System.in);
			 char guess= input.next().charAt(0);
			 int counter=0;
			 
			  for (int i=0;i<collect.length;i++) {
				  if (guess == display[i]) {
					  System.out.println(guess+" is already in the word");
					  counter++;
					  break;
				  }
				 
				  if (guess == collect[i]) {
					  display[i]=guess;
					  counter++;
					   } 
					  
			}
			  if (counter==0) {
				  missed++;
			  System.out.println(guess+" is not in the word");}
			  for (char each:display) {
				
				  System.out.print(each);
			  }
			  return missed;
		}

		public static boolean control(char[]display) {
			int count=0;
			for (int i=0;i<display.length;i++) {
				if (display[i]=='*') {
					count++;
					break;}
		}
			if (count>0) {
				return true;
			}
			else {return false;
		}
		} 
}
	

 

    
