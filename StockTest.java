package stock;

public class StockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		
		s1.setStockClPrice(34.5);
		s1.setStockCrPrice(34.35);

		System.out.println("Stock name: " + s1.getStockName());
		System.out.println("Symbol: " + s1.getStockSymbol());
        System.out.println("previous price: " + s1.getPreviousClosingPrice());
        System.out.println("current price: " + s1.getCurrentClosingPrice());
        System.out.println("Percent changed: " + s1.getChangedPercentage() +"%");
	}

}
