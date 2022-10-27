package stock;

public class Stock {

	private String stockSymbol;
	private String stockName;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock()
	{
		stockSymbol = "";
		stockName = "";
		previousClosingPrice = 0;
		currentPrice = 0;
	}
	public Stock(String symbol, String name)
	{
		stockSymbol = symbol;
		stockName = name;
	}
	
	public String getStockSymbol()
	{
		return stockSymbol;
	}
	public String getStockName()
	{
		return stockName;
	}
	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}
	public double getCurrentClosingPrice()
	{
		return currentPrice;
	}
	
	public void setStockSymbol(String symbol)
	{
		stockSymbol = symbol;
	}
	public void setStockName(String name)
	{
		stockName = name;
	}
	public void setStockClPrice(double clPrice)
	{
		previousClosingPrice = clPrice;
	}
	public void setStockCrPrice(double crPrice)
	{
		currentPrice = crPrice;
	}
	
	public double getChangedPercentage()
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
	}
	
		
}
