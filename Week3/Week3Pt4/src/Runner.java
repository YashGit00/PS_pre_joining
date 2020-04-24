import java.util.ArrayList;
import java.util.Scanner;

public class Runner
{
	public static void main(String[] args)
	{
		System.out.println(LongToString.fig_to_words(new Scanner(System.in).nextLong()));
	}
}

class LongToString
{
	public static String fig_to_words( long num)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		String words = "";
		Long number = num;
		while ( num > 0)
		{
			numList.add((int) (num%10));
			num = num / 10;
		}
		System.out.println(numList);
		
		for ( int i = 0; i < numList.size(); i+=3)
		{
			switch(i)
			{
			case 0: words = "only."; break;
			case 3: words = "thousand, "+words; break;
			case 6: words = "million, "+words; break;
			}
			if ( i+2 < numList.size())
				words = WordsOfThree(numList.get(i+2), numList.get(i+1), numList.get(i))+words;
			else
			{
				switch((numList.size())%3)
				{
				case 1: words=WordsOfThree(0, 0, numList.get(i))+words; break;
				case 2: words=WordsOfThree(0, numList.get(i+1), numList.get(i))+words; break;
				}
			}
		}
		
		return words;
	}
	
	public static String WordsOfThree(int a, int b, int c)
	{
		String words = "";
		switch( a)
			{
			case 1: words = words+"one hundred "; break;
			case 2: words = words+"two hundred "; break;
			case 3: words = words+"three hundred "; break;
			case 4: words = words+"four hundred "; break;
			case 5: words = words+"five hundred "; break;
			case 6: words = words+"six hundred "; break;
			case 7: words = words+"seven hundred "; break;
			case 8: words = words+"eight hundred "; break;
			case 9: words = words+"nine hundred "; break;
			}
		if (b==1)
		{
			switch( c) 
			{
			case 0: words = words+"ten "; break;
			case 1: words = words+"eleven "; break;
			case 2: words = words+"tweleve "; break;
			case 3: words = words+"thirteen "; break;
			case 4: words = words+"fourteen "; break;
			case 5: words = words+"fifteen "; break;
			case 6: words = words+"sixteen "; break;
			case 7: words = words+"seventeen "; break;
			case 8: words = words+"eighteen "; break;
			case 9: words = words+"nineteen "; break;
			}
		}
		else
		{
			switch(b)
			{
			case 2: words = words+"twenty "; break;
			case 3: words = words+"thirty "; break;
			case 4: words = words+"forty "; break;
			case 5: words = words+"fifty "; break;
			case 6: words = words+"sixty "; break;
			case 7: words = words+"seventy "; break;
			case 8: words = words+"eighty "; break;
			case 9: words = words+"ninety "; break;
			}
			switch(c)
			{
			case 1: words = words+"one "; break;
			case 2: words = words+"two "; break;
			case 3: words = words+"three "; break;
			case 4: words = words+"four "; break;
			case 5: words = words+"five "; break;
			case 6: words = words+"six "; break;
			case 7: words = words+"seven "; break;
			case 8: words = words+"eight "; break;
			case 9: words = words+"nine "; break;
			}
		}
		return words;
	}
}