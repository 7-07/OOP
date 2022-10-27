package lab6q2;


public class SavingsAccount extends BankAccount{
	
  double overdraftLimit = 0;

  public void withdraw (double w) {
      if (balance - w < overdraftLimit)
              System.out.println("Insufficient Funds");
      else
          balance = balance - w;
  }
}


