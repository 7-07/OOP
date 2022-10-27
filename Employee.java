package university;

public class Employee extends Person {

	private double salary; 
	
	public Employee ()
	{
		super();
		salary = 0;
	}
	
	public Employee (String n, String id, double s)
	{
		super(n,id);
		//setName(n);
		//setID(id);
		salary = s;
		
	}

	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double s)
	{
		salary = s;
	}
	
	@Override
	public String toString() //different from overloading where we change the parameter type
	{
		return super.toString()+ "\nSalary : " +salary;	}
	
}
