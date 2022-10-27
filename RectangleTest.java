package rectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); //declaring the type of scanner as "input"
	
		
		Rectangle r1 = new Rectangle(4, 40); //object 1
		Rectangle r2 = new Rectangle(3.5, 35.9); // object 2
		
		System.out.println("--------------------------------------");
		
		System.out.println("the first rectangle's width: "+ r1.getWidth());
		System.out.println("the first rectangle's height: "+ r1.getHeight());
		System.out.println("the first rectangle's area is:  " + r1.getArea()); //print out the calculated area
		System.out.println("the first rectangle's perimeter is :  " + r1.getPerimeter()); //print out calculated perimeter

		System.out.println("--------------------------------------");

		System.out.println("the second rectangle's width: "+ r2.getWidth());
		System.out.println("the second rectangle's height: "+ r2.getHeight());
		System.out.println("the second rectangle's area is:  " + r2.getArea()); //print out the calculated area
		System.out.println("the second rectangle's perimeter is :  " + r2.getPerimeter()); //print out calculated perimeter
		System.out.println("--------------------------------------");
	}
}
