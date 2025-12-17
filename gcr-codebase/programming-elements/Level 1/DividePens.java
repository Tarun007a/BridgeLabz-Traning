public class DividePens{
	public static void main(String[] args){
		// Initializing pens and students
		int pens = 14;
		int students = 	3;
		
		// calculating pens per user and undistrubuted pens
		int pensPerStudent = pens/students;
		int leftPens = pens % students;
		
		// printing the result
		System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + leftPens);
	}
}