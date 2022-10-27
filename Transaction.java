package lab7;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
	
	private Date date;
	private char type; 
	private double amount;
	private double balance;
	private String description;
	private ArrayList<Transaction> array_list = new ArrayList<Transaction>();

	
	public Transaction()
	{}
	
	public Transaction( char t, double a, double b, String desc)
	{
		type = t;
		amount = a;
		balance = b;
		description = desc;
		date = new java.util.Date(); 
	}
	
	public void setDate(Date d)
	{
		date = d; 
	}
	
	public void setType(char t)
	{
		type = t;
	}
	
	public void setAmount(double a)
	{
		amount = a;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public void setDescription(String d)
	{
		description = d;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public char getType()
	{
		return type;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public ArrayList<Transaction> getTransactions() {
		for (int i = 0; i < array_list.size(); i++) 
		  {
		   System.out.println((array_list.get(i)).toString());
		  }
		return array_list;
	}
	
	public String toString()
	{
		return "Account type: " + type +"\nCreation date : " + date + "\nAmount: " + amount + "\nBalance: " + balance + "\nTransaction description: "+ description;
	}
}
