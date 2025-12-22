public class NullException{
	// method to generate null pointer exception
	private static void generateException(String s) throws NullPointerException{
		s.length();
	}
	
	public static void main(String[] args){
		String txt = null;
		try{
			generateException(txt);
		}
		catch(NullPointerException e){
			System.out.println("Exception Handeled");
			e.printStackTrace();
		}
	}
}