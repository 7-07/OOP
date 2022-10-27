package lab6lab;

public class Student extends Person {
	
    private final String STATUS = "Sophomore";
 
	
	public Student()
	{}
	
	public Student(String n, String add, String phone, String email,String state)
	{
		super(n, add, phone, email);   
	}
	
	@Override
	public String toString() //different from overloading where we change the parameter type
	{
		return super.toString()+ "\nStatus : " + STATUS;	}

}
