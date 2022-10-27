package ex1;

import java.util.GregorianCalendar;

public class Exercise2 {

	public static void main(String[] args) {
	
			GregorianCalendar calender = new GregorianCalendar();
				
			System.out.print("Current day info(MM-DD-YY): ");
			System.out.println(calender.get(calender.MONTH) +1 + "-" + calender.get(calender.DAY_OF_MONTH) + "-" + calender.get(calender.YEAR));

			calender.setTimeInMillis(1234567898765L);

			System.out.print("Elapsed time since January 1st, 1970: ");
			System.out.println(calender.get(calender.MONTH) + "-" +
			calender.get(calender.DAY_OF_MONTH) + "-" + calender.get(calender.YEAR));
			
			}
		}