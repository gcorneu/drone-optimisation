package org.hashcode.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
	public void readFile(String filename) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
		String s = scanner.nextLine();
		String mapParams[] = s.split(" ");
		Map map = new Map(Integer.parseInt(mapParams[0]), Integer.parseInt(mapParams[1]),
				Integer.parseInt(mapParams[2]), Integer.parseInt(mapParams[3]), Integer.parseInt(mapParams[4]));
		int numOfproductTypes = Integer.parseInt(scanner.nextLine());
		String[] weights = scanner.nextLine().split(" ");
		ArrayList<IProduct> products = new ArrayList<>();
		for(int i = 0; i<weights.length; i++) {
			products.add(new Product(Integer.parseInt(weights[i])));
		}
		int numOfWarehouses = Integer.parseInt(scanner.nextLine());
		
	}
}
