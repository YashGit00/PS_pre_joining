import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import jdk.internal.util.xml.impl.Pair;

public class Runner2 
{
	interface Num_Proc
	{
		public int cal(int a, int b);
	}
	public static void main(String[] args) 
	{
		Num_Proc add = ( int x, int y)->x+y;
		Num_Proc mul = (int x, int y)->x*y;
		Num_Proc sub = (int x, int y)->x-y;
		Num_Proc div = (int x, int y)->x/y;
		
		HashMap<Integer, Num_Proc> calculate = new HashMap<Integer, Runner2.Num_Proc>(4);
		calculate.put(1, add);
		calculate.put(2, sub);
		calculate.put(3, mul);
		calculate.put(4, div);
		
		System.out.println("Enter operands :");
		Scanner scan =  new Scanner(System.in);
		int n1 = scan.nextInt(), n2 = scan.nextInt();
		System.out.println("Enter operation (\n1. add\n2.sub\n3.mul\n4.div\n:");
		int op = scan.nextInt();
		System.out.println(calculate.get(op).cal(n1, n2));
		
	}
}
