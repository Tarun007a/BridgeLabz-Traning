import java.util.*;

public class CardDeck{
	// method to return the deck of cards
    private static String[] getDeck(){
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int numOfCards = suits.length * ranks.length;
        String[] result = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                result[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return result;
    }

    // method for randomly shuffle the cards
    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
		
        for (int i = 0; i < n; i++) {
            int random = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        return deck;
    }

    // method to check and distribute cards among given players
    static String[][] distributeCards(int n, String[] deck) {
        int m = deck.length;
		if(m%n != 0) return null;
		
        String[][] result = new String[n][m/n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/n; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

	// print the results
	static void display(String[][] cards) {
        for(String[] card : cards){
			System.out.println(Arrays.toString(card));
		}
    }

    public static void main(String[] args) {
		// calling fucntion and printing results
		Scanner sc = new Scanner(System.in);
        String[] deck = getDeck();

		System.out.print("Enter number of players: ");
        int n = sc.nextInt();
		shuffleDeck(deck);
		String[][] cards = distributeCards(n, deck);
		if(cards == null){
			System.out.println("Cards cannot be distributed among n players");
		}
		else{
			display(cards);
		}
    }
}