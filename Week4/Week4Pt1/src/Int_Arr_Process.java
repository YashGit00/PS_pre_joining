import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process 
{
	int[] arr;
	int n;
	public Int_Arr_Process()
	{
		arr = new int[10];
		n = 10;
	}
	public Int_Arr_Process(int n)
	{
		arr = new int[n];
		this.n = n;
	}
	public Int_Arr_Process(int[] arrcpy)
	{
		this.n = arrcpy.length;
		arr = new int[n];
		for (int i = 0; i < arrcpy.length; i++) 
		{
			arr[i] = arrcpy[i];
		}
	}
	public Int_Arr_Process(Int_Arr_Process a)
	{
		this.arr = a.arr;
	}
	public void readArr()
	{
		System.out.print("\nEnter the size of array :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = scan.nextInt();
		}
	}
	public void displayH()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void displayV()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public void sort()
	{
		Arrays.sort(arr);
	}
	public int getLargest()
	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = max < arr[i] ? arr[i] : max;
		}
		return max;
	}
	public int getSmallest()
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = min > arr[i] ? arr[i] : min;
		}
		return min;
	}
	public int sum()
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
