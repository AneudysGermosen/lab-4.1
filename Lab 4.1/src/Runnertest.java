
public class Runnertest 
{
	public static void main(String[] args) 
	{
		String[] rank = {"3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		String[] suit = {"Hearts","Clubs","Spades","Diamonds"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	Deck decktest = new Deck( rank, suit, value);
	decktest.shuffle();
	int m = decktest.size();
		for(int i =0;i<m;i++)
		{
		decktest.deal();
		}
	}

}
