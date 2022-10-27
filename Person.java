package university;

public class Person {

	private String name;
	private String NID;
	
	public Person ()
	{
		name = "";
		NID= "";
		
	}
	
	public Person( String n, String id) {
		name = n;
		NID = id;
		
	}
	
	public String getname ()
	{
		return name;
	}
	
	public String getNID()
	{
		return NID;
	
	}
	
	public void setname (String nsame)
	{
		name = nsame;
	}
	public void setNID(String NsID)
	{
		NID = 	NsID;
	}
	
	public static void main(String[]args) {
		Person p1 = new Person ();
		Person p2 = new Person ("Razan", "118963");
		
		System.out.println(p1);
		System.out.println(p2);
		
		Employee e1 = new Employee ("Akila", "13494", 100000);
		
		System.out.println(e1);
	}
	
	public String toString() 
	{
		return "\nName : " + name + "\nNID : " + NID ;
	}
}

