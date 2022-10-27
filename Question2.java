package lab7;

import java.util.ArrayList;


public class Question2 {


		public static void main(String[] args) {
		
			Account account1 = new Account("Jojo", "1122", 4500);
			Account account2 = new Account("Zim", "9817", 8000);
			Transaction transaction1 = new Transaction('S', 300, 4500, "Withdraw");
			Transaction transaction2 = new Transaction('D', 550, 8000, "Deposit");
		
			account1.setAnnualInterestRate(1.5);
			account2.setAnnualInterestRate(2.0);
		
		    account1.withdraw(300);

			account2.deposit(550);
		
			System.out.println("\n    Transactions list: ");
			System.out.println("------------------------------------");
			
			account1.addTransactions(transaction1);
			account2.addTransactions(transaction2);
			
			for (int i = 0; i < account1.getTransactions().size(); i++) {
				
				System.out.println(account1.toString());
				
				System.out.println("------------------------------------");
				
			}
			System.out.println("------------------------------------");
			for (int i = 0; i < account2.getTransactions().size(); i++) {

				System.out.println(account2.toString());
				System.out.println("------------------------------------");
			}
		
		}
	}
	
