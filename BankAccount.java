package lab6q2;

import java.util.Date;


class BankAccount {
private String id;
 double balance;
 private static double annualInterestRate;
 private Date dateCreated;

public BankAccount() {
  dateCreated = new java.util.Date();
}

public BankAccount(String newId, double newBalance) {
   id = newId;
   balance = newBalance;
   dateCreated = new java.util.Date();
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


}
