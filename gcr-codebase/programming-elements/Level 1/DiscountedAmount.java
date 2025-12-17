public class DiscountedAmount{
	public static void main(String[] args){
		// Initializing fees and discount percentage
		int fees = 125000;
		int discountPercentage = 10;
		
		// calculating discount and discounted price
		int discount = (12500/100)*discountPercentage;
		int discountedAmount = fees - discount;
		
		// printing the result
		System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + discountedAmount);
	}
}