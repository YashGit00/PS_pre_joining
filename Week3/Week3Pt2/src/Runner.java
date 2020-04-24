import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) 
	{
		Command_Line1 cmd1 = new Command_Line1();
		cmd1.setData(args);
		cmd1.calData();
		cmd1.displayData();
	}

}
class Command_Line1
{
	int n, sum, min, max;
	float avg;
	ArrayList<Integer> arr = new ArrayList<Integer>(n);
	public void setData( String[] args)
	{
		n = Integer.parseInt(args[0])-1;
		for ( int i = 0; i < n; i++)
		{
			arr.add(i, Integer.parseInt(args[i+1]));
		}
	}
	
	public void calData()
	{
		min = Integer.MAX_VALUE;
		sum = 0;
		max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) 
		{
			sum += arr.get(i);
			if ( min > arr.get(i)) min = arr.get(i);
			if ( max < arr.get(i)) max = arr.get(i);
		}
		avg = (float)sum/n;
	}
	
	public void displayData()
	{
		System.out.println("Sum :"+sum+"\nAverage :"+avg+"\nSmallest :"+min+"\nLargest :"+max+"\n");
	}
}

