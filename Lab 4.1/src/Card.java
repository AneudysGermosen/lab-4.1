
public class Card 
{
	String rank;
	String suit;
	int pointValue;
	
	public Card(String cardrank,String cardSuit,int cardValue) 
	{
		rank=cardrank;
		suit=cardSuit;
		pointValue=cardValue;
	}
	
	public String getRank() 
	{
		return rank;
	}
	
	public String getSuit() 
	{
		return suit;
	}
	
	public int getPointValue() 
	{
		return pointValue;
	}
	
	public boolean equals(Card otherCard) 
	{
		if(this.pointValue==otherCard.getPointValue()) 
		{
			return true;
		}
		return false;
	}
	
	public String toString() 
	{
		return "rank="+rank+" suit="+suit+" pointValue="+pointValue;
	}
}
