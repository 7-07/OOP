package leagueOfLegends;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class LeagueOfLegendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------");
		
		JOptionPane.showMessageDialog(null, "Welcome to League of Legends team enrollment. You are currently viewing as "
				+ "first guest, please enter your information to create an account:");
		
		System.out.println("enter the username: ");
		String name1 = input.nextLine();
		System.out.println("enter the password: ");
		String pass1 = input.nextLine();
		System.out.println("enter the number of champions mastered: ");
		int champions1 = input.nextInt();
		LeagueOfLegends player1 = new LeagueOfLegends(name1, pass1, champions1);
	
		System.out.println("This is your current account info: ");
	
		System.out.println("username: " + player1.getUsername());
		System.out.println("password: " + player1.getPassword());
		System.out.println("champions mastered: " + player1.getChampionMastery());
	
		System.out.println("-----------------------------------------");
	
		JOptionPane.showMessageDialog(null, "Now, choose a role to be assigned to, according to your prefrence: ");
	
		player1.preferredRoleMenu();
	
		System.out.println("Enter the number of your selection: ");
		int choice1 = input.nextInt();
		input.nextLine();
		player1.preferredRoleAssignment(choice1);
		
		JOptionPane.showMessageDialog(null, "Your total mastery progress is: "+ champions1 +" out of 158. " + player1.calculateMasteryProgress(champions1) +" champions left.");
		
		System.out.println("----------------------------------------------------------------------------");
	
		
		JOptionPane.showMessageDialog(null, "Welcome to League of Legends team enrollment. You are currently viewing as "
				+ " second guest, please enter your information to create an account:");
		
		System.out.println("enter the username: ");
		String name2 = input.nextLine();
		System.out.println("enter the password: ");
		String pass2 = input.nextLine();
		System.out.println("enter the number of champions mastered: ");
		int champions2 = input.nextInt();
		LeagueOfLegends player2 = new LeagueOfLegends(name2,pass2,champions2);
	
		System.out.println("This is your current account info: ");;
	
		System.out.println("username: " + player2.getUsername());
		System.out.println("password: " + player2.getPassword());
		System.out.println("champions mastered: " + player2.getChampionMastery());
	
		System.out.println("-----------------------------------------");
	
		JOptionPane.showMessageDialog(null, "Now, choose a role to be assigned to, according to your prefrence: ");
	
		player2.preferredRoleMenu();
	
		System.out.println("Enter the number of your selection: ");
		int choice2 = input.nextInt();
	
		player1.preferredRoleAssignment(choice2);
		
		JOptionPane.showMessageDialog(null, "Your total mastery progress is: "+ champions2 +" out of 158. " + player2.calculateMasteryProgress(champions2) +" champions left.");
		
	
		
	}

}
