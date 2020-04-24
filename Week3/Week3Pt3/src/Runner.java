import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		KeyRead_Line2 krl2 = new KeyRead_Line2();
		krl2.Read();
		krl2.Display();
		krl2.sort();
		krl2.Display();
		System.out.println(krl2.find(new Scanner(System.in).nextInt()));
		System.out.println(krl2.find(new Scanner(System.in).nextInt()));
	}

}

class KeyRead_Line2 {
	int n;
	ArrayList<Integer> arr = new ArrayList<Integer>(n);

	public void Read() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			arr.add(i, scan.nextInt());
		}
	}

	public void Display() {
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	public void sort() {
		arr.sort(null);
	}

	public boolean find(int find) {
		return arr.contains(find);
	}
}