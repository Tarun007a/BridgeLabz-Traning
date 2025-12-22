public class IndexException{
	// method to generate index out of bound exception
	private static void generateException(String s) throws IndexOutOfBoundsException{
		s.charAt(10);
	}
	
	public static void main(String[] args){
		String txt = "demo";
		try{
			generateException(txt);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}