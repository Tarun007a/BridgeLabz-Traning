public class FormatException{
	// method to generate number format exception
	private static void generateException(String s) throws NumberFormatException{
		Integer.parseInt(s);
	}
	
	public static void main(String[] args){
		String s = "demo";
		try{
			generateException(s);
		}
		catch(NumberFormatException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}