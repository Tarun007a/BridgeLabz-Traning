public class ProfitAndLoss{
	public static void main(String[] args){
		// Initializing cost price and selling price
		double costPrice = 129;
		double sellingPrice = 191;
		
		// finding profit and profit percentage
		double profit = sellingPrice - costPrice;
		double profitPercentage = (profit / costPrice) * 100;
		
		// printing the result
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + ".\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}