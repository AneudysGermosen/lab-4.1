
public class Runnerrr {

		public static void main(String args[]) {

			String[] rank = { "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2" };
			String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
			int[] pointValue = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

			Deck d = new Deck(rank, suits, pointValue);
			d.shuffle();
			System.out.println(d.deal());
		}

	}
