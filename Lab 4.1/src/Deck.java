import java.util.ArrayList;


public class Deck 
{
	ArrayList<Card> undealt;
	ArrayList<Card> dealt;
	
	public Deck(String[] rank,String[] suit, int[] value) 
	{
		undealt = new ArrayList<Card>();
		dealt = new ArrayList<Card>();
		
		for(int i =0;i<rank.length;i++) 
		{
			for(String s: suit) 
			{
				
				undealt.add(new Card(rank[i],s,value[i]));
			}	
		}
		
		
		
	}
	
	public boolean isEmpty() 
	{
		return undealt.size()+dealt.size()==0;
	}
	
	public int size() 
	{
		return undealt.size();
	}
	
	public void deal() 
	{
		if(undealt.size()>0) 
		{
			dealt.add(undealt.get(undealt.size()-1));
			undealt.remove(undealt.size()-1);
		System.out.println(dealt.get(dealt.size()-1).toString());	
		}
	}
	
	public void shuffle() 
	{
		for(int i =0;i<dealt.size();i++) 
		{
			undealt.add((int)(Math.random()*undealt.size()),dealt.get(i));
			dealt.remove(i);
		}
		for(int k = undealt.size()-1;k>-1;k--) 
		{
			int rindex = (int)(Math.random()*(k+1));
			Card holder = undealt.get(rindex);
			undealt.set(rindex, undealt.get(k));
			undealt.set(k, holder);
		}
	}
}
