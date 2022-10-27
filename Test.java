package lab6q2;

public class Test  {

	   SavingsAccount savings = new SavingsAccount();
	   CheckingAccount checking = new CheckingAccount();
	   BankAccount account;

	   public static void main (String[] args) {
	   BankAccount account = new BankAccount("896113", 80000);

	   System.out.println("Account has been created at: " +
				  account.getDateCreated()); 
	  System.out.print("\nAfter Creation: " );
	   Print (account.getBalance());
	   
	  BankAccount.setAnnualInterestRate(4.5);
	   System.out.print("\nAfter Withdrawing 9,580$:  " );
	   account.withdraw(9580);
	   
	   Print(account.getBalance());
	   
	    System.out.print("\nAfter Deposit of 77,092$: " );
	    account.deposit(77092);
	   Print (account.getBalance());
	   
	   
	    System.out.println("\n The monthly interest is: " +
	  account.getMonthlyInterest());
	    } 
	 
	     public static void Print(double x){
	     System.out.printf("The current balance is "+" $ "+"%4.2f"+"%n",x);
	    }
	  }

