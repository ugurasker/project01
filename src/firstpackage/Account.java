package firstpackage;

import java.util.Date;

  public class Account {
     private int id;
     private double balance;
     private double annualInterestRate;
     private java.util.Date dateCreated;
  public Account() {
	
}
public Account(int id, double balance) {
	
	this.id = id;
	this.balance = balance;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}

public Date getDateCreated() {
	dateCreated=  new java.util.Date();
 return dateCreated;
}
public double getMonthlyInterestRate () {
	double monthlyInterestRate= getAnnualInterestRate()/12;
	return monthlyInterestRate;
}
public double getMonthlyInterest() {
	return balance*getMonthlyInterestRate()/100;
}

public double withdraw (double amount) {
	balance=getBalance()-amount;
	return balance;
}
public double deposit (double amount) {
	balance =getBalance()+amount;
	return balance;
}
   
   
}
