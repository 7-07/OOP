package lab7;
import java.util.ArrayList;

import java.util.Date;

public class Question1 {
	
	
	 public static void main(String[] args) 
	 {
	  ArrayList<Object> arr_list = new ArrayList<Object>();

	  arr_list.add(new Account("Chrollo Lucifer", "9981003", 870000));
	  arr_list.add(new Date());  
	  arr_list.add(new String("Question 1 of Lab 7")); 
	  arr_list.add(new Circle(3.45)); 
	  for (int i = 0; i < arr_list.size(); i++) 
	  {
	   System.out.println((arr_list.get(i)).toString());
	  }
	 }
	}

	

	
	