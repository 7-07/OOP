package leagueOfLegends;

public class LeagueOfLegends {
	
	private String username;
	private String password;
	private int masteryLevel;
	

	public LeagueOfLegends()
	{
		username = "";
		password = "";
		masteryLevel = 0;
	}
	
	public LeagueOfLegends(String name, String pass, int champions)
	{
		username = name;
		password = pass;
		masteryLevel = champions;
	}
	
	public LeagueOfLegends(int champions)
	{
		masteryLevel = champions;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public int getChampionMastery()
	{
		return masteryLevel;
	}
	
	public void setUsername(String name)
	{
		username = name;
	}
	public void setPassword(String pass)
	{
		password = pass;
	}
	public void setChampionMastery(int champions)
	{
		masteryLevel = champions;
	}
	public int calculateMasteryProgress(int champions)
	{
		
			if (champions > 0 && champions <= 30) {
		  System.out.println("Your mastery tier is Iron");}
		  else if (champions > 30 && champions <= 50) {
		    System.out.println("Your mastery tier is Bronze");}
		  else if (champions > 50 && champions <= 70) {
		    System.out.println("Your mastery tier is Silver");}
		  else if (champions > 70 && champions <= 90) {
		    System.out.println("Your mastery tier is Gold");}
		  else if (champions > 90 && champions <= 110) {
		    System.out.println("Your mastery tier is Platinum");}
		  else if (champions > 110 && champions <= 130) {
			System.out.println("Your mastery tier is Diamond");}
		  else if (champions > 130 && champions <= 158) {
			  System.out.println("Your mastery tier is Challenger");}
		  else 
			  System.out.println("Your input mastery is undefined");
		
		int totalNumOfChampions =  158;
		int masteryLevel = totalNumOfChampions - champions;
		return masteryLevel;
}


	
	public void preferredRoleMenu() 
	{
		System.out.println("What gameplay style suits you best? ");
		System.out.println("1. 1v1 fights. far proximity within the map.");
		System.out.println("2. 1v1 fights. close proximity within the map.");
		System.out.println("3. 2v2 fights. aggressive playstyle.");
		System.out.println("4. 2v2 fights. defensive playstyle. ");
		System.out.println("5. objectives task hunts. free map roaming. ");	
		
	}
	
	public void preferredRoleAssignment(int choice)
	{
		switch (choice) {
		  case 1:
		    System.out.println("Your assigned role is Top");
		    break;
		  case 2:
		    System.out.println("Your assigned role is Mid");
		    break;
		  case 3:
		    System.out.println("Your assigned role is ADC");
		    break;
		  case 4:
		    System.out.println("Your assigned role is Support");
		    break;
		  case 5:
		    System.out.println("Your assigned role is jungler");
		    break;
		   default:
			System.out.println("the number you entered is invalid.");
		}
	}
}
