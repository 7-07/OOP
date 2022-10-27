package lab5;

import java.math.BigDecimal;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  BigDecimal longMaxVal = new BigDecimal(Long.MAX_VALUE); //creating an obj of type BigDecimal with max value as parameter
		  long start = (long) Math.sqrt(Long.MAX_VALUE); //creating a long variable and squaring its values (max values)
		  BigDecimal x = new BigDecimal(start); //creating an obj of type BigDecimal that takes long value x as parameter 
		     
		  int i = 0; //declaring index 
		  
		  while ( i < 10) //while the index is less than 10, do the following 
		  {
			  BigDecimal intSquare = x.multiply(x); //squaring the value of x
			  
			  		if (intSquare.compareTo(longMaxVal) > 0) //check if the squared value matches the max value and larger than 0
			  		{
		                i++; 
		                System.out.println("Value number " +i+": " + x + "^2 = " + intSquare); //printing the value
		            }
			  	  x = x.add(BigDecimal.ONE);
		        }
		}
}
