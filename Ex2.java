package lab5;

import java.math.BigDecimal; // importing both math and BigDecimal class
import java.math.RoundingMode;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal divided = new BigDecimal("22"); //we calculate the accurate value of PI by using 
		BigDecimal divisor = new BigDecimal("7");  //BigDecimal division
		BigDecimal result = divided.divide(divisor, 200, RoundingMode.HALF_UP); //setting number of digits 
																				//to 200, and rounding it with 
		System.out.println(result);												//respect to the last value before 
																				//the 200th digit 
	 }    		        
}


