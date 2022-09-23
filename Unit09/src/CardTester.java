/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** spades, clubs, hearts, and diamonds.*/
		Card testCard1 = new Card ("10","heart",10); 
		Card testCard2 = new Card ("jack","diamond",11); 
		Card testCard3 = new Card ("3","spade",3); 
		
		
		System.out.println(testCard1); 
		System.out.println(testCard2); 
		System.out.println(testCard3); 
		
		Card testCard4 = new Card ("10","heart",10); 
		System.out.print(testCard1.matches(testCard3)); 
		System.out.print(testCard1.matches(testCard4)); 
		
	}
}
