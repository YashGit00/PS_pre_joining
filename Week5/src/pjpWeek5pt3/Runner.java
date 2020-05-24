package pjpWeek5pt3;

import java.io.File;

public class Runner {

	public static void main(String[] args) {
		File dir = new File("/home/ttxt");
		String[] list = dir.list();
		if (list == null) {
			System.out.println("Either dir does not exist or is not a directory");
		} else {
			for (int i = 0; i < list.length; i++) {
				String filename = list[i];
				System.out.println(filename);
			}
		}
	}

}
