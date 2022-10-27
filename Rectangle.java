package rectangle;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle()
	{
		width = 1;
		height = 1;
	}
	
	public Rectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	
	//getter and setter
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getArea()
	{
		double area;
		 area = height * width;
		return area;
	}
	
	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2*(height+width);
		return perimeter;
	}

}


