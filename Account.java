package lab7;
import java.util.ArrayList;
import java.util.Date;

public class Account {

	 private String id;
	 double balance;
	 private String name;
	 private static double annualInterestRate;
	 private Date dateCreated;
	 private ArrayList<Transaction> array_list = new ArrayList<Transaction>();
	 

	public Account() {
	  dateCreated = new java.util.Date();
	}

	public Account(String newId, double newBalance) {
	   id = newId;
	   balance = newBalance;
	   dateCreated = new java.util.Date();
	 }

	public Account(String n, String i, double b) {
		name = n;
		balance = b;
		id = i;
	}

	public String getID() {
	  return this.id;
	    }

	 public double getBalance() {
	  return balance;
	  }

	   public static double getAnnualInterestRate() {
	    return annualInterestRate;
	    }

	  public void setID(String newId) {
	   id = newId;
	   }

	  public void setBalance(double newBalance) {
	   balance = newBalance;
	   }
	  
	  public void setName(String n) {
		   name = n;
		   }
	  
	  public String getName()
	  { return name;}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
	  annualInterestRate = newAnnualInterestRate;
	}

	public double getMonthlyInterest() {
	 return balance * (annualInterestRate / 1200);
	}

	public java.util.Date getDateCreated() {
	 return dateCreated;
	}

	 public void withdraw(double amount) {
	  balance -= amount;
	}

	  public void deposit(double amount) {
	  balance += amount;
	 }

	  public void addTransactions(Transaction t)
	  {
		  array_list.add(t);
	  }
	  
	  public String toString(){
		  return "----------------------------------" + "\nAccount user name:  " + name + "\nAccount ID: " + id+ "\nInterest rate: " + annualInterestRate+ "\nAccount current balance: "+ balance;
	  }

	public ArrayList<Transaction> getTransactions() {
		for (int i = 0; i < array_list.size(); i++) 
		  {
		   System.out.println((array_list.get(i)).toString());
		  }
		return array_list;

	}
}

