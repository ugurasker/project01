package firstpackage;

public class Dokuz_Yedi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Account acc = new Account (1122,20000);
             acc.setAnnualInterestRate(4.5);
             acc.withdraw(2000);
             acc.deposit(3000);
             System.out.println(acc.getBalance()+" "+acc.getMonthlyInterest()+" "+acc.getId()+" " +acc.getDateCreated());
	}

}
