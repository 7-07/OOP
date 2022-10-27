package lab6lab;

public class Faculty extends Employee {
	
	private String rank;
	private String officeHours;
	
	  public Faculty()
	  {}
	  
	  public Faculty(String n, String add, String num, String email, double paying, String room,String r, String hours)
	  {
		  super(n, add, num, email, paying, room);
		  rank = r;
		  officeHours = hours;
	  }
	  
	  public void setRank(String r)
	  { rank = r;}
	  
	  public String getRank()
	  {return rank;}
	  
	  public void setOfficeHours(String office)
	  {officeHours = office;}
	  
	  public String getOfficeHours()
	  {return officeHours;}
	  
	  @Override
	  public String toString() 
		{
			return super.toString()+ "\nRank : " + rank + "\nOffice hours : " + officeHours;
		}
	}

	
	 
