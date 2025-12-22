public class ArgumentException{
	// method to generate illegal argument exception
	private static void generateException(String s) throws IllegalArgumentException{
		s.substring(10);
	}
	
	public static void main(String[] args){
		String txt = "demo";
		try{
			generateException(txt);
		}
		catch(IllegalArgumentException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}