package lab6lab;

public class Staff extends Employee {

	private String title;
	
	public Staff()
	{}
	
	public Staff(String n, String add, String num, String email, double paying, String room, String t)
	{
		super(n, add, num, email, paying, room);
		title = t;
	}
	
	public String getTitle()
	{return title;}
	
	public void setTitle(String t)
	{title = t;}
	
	@Override
	public String toString()
	{
		return super.toString()+ "\nTitle: " + title;
	}
}
