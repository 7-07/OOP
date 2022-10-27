package bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the account number:");
		
		String num = input.nextLine();
		System.out.println("enter the balance: ");
		double b = input.nextDouble();
		
		Account a2 = new Account(num, b);
		
		System.out.println("the account number is:  " + a2.getAccountNumber());
		System.out.println("the balance is :  " + a2.getBalance());

		Account a1 = new Account();
		//Account a2 = new Account("12345", 500);
		System.out.println(a1.getBalance());
		a1.withdraw(100);
		System.out.println(a1.getBalance());
		a2.withdraw(200);
		System.out.println(a2.getBalance());
	}

}