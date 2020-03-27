import sun.security.util.Length;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */

	public static Deck makeDeck(){
		String[] rank = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] values = {11, 12, 13};
		Deck deck = new Deck(rank, suits, values);
		return deck;
		
	}

	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		int length = 5;
		String[] rank = new String[length];
		String[] suits = new String[length];
		int[] values = new int[length];
		
		// Deck deck = new Deck(rank, suits, values);
		Deck deck = makeDeck();
		System.out.println(deck.size());

	}
}
