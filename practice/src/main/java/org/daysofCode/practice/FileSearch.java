package org.daysofCode.practice;

import java.io.File;

public class FileSearch {

	private static boolean search(File file, String fileName) {

		if (file.getName().equals(fileName)) {
			System.out.println("Found file " + fileName + " from " + file.getPath());
			return true;
		}

		if (file.isFile())
			return false;

		for (File f : file.listFiles()) {
			boolean found = search(f, fileName);
			if (found)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		new FileSearch().search(new File("C:\\Go"), "XMPLicense.pdf");

	}

}
