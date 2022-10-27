package ex1;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

	  Random num = new java.util.Random(1000);

	for (int x = 0; x < 50; x++) {
		System.out.print(num.nextInt(100) + " ");
		        
	  }
	}
}
