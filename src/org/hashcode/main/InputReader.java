package org.hashcode.main;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputReader {
	private static Map map;
	public static void readFile(String filename) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
		String s = scanner.nextLine();
		String mapParams[] = s.split(" ");
		map = new Map(Integer.parseInt(mapParams[0]), Integer.parseInt(mapParams[1]),
				Integer.parseInt(mapParams[2]), Integer.parseInt(mapParams[3]), Integer.parseInt(mapParams[4]));
		int numOfproductTypes = Integer.parseInt(scanner.nextLine());
		String[] weights = scanner.nextLine().split(" ");
		ArrayList<IProduct> products = new ArrayList<>();
		for(int i = 0; i<weights.length; i++) {
			products.add(new Product(i, Integer.parseInt(weights[i])));
		}
		int numOfWarehouses = Integer.parseInt(scanner.nextLine());
		ArrayList<Warehouse> warehouses = new ArrayList<>();
		for(int i = 0; i< numOfWarehouses; i++) {
			String coords[] = scanner.nextLine().split(" ");
			Point coord = new Point(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
			String[] numberOfProducts = scanner.nextLine().split(" ");
			ArrayList<Integer> nup = new ArrayList<>();
			for(int j = 0; j<numberOfProducts.length; j++) {
				nup.add(Integer.parseInt(numberOfProducts[j]));
			}
			warehouses.add(new Warehouse(coord, nup));
		}
		ArrayList<Order> orders = new ArrayList<>();
		int numOfOrders = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i< numOfOrders; i++) {
			String[] delivery = scanner.nextLine().split(" ");
			Point deliverTo = new Point(Integer.parseInt(delivery[0]), Integer.parseInt(delivery[1]));
			int numOfItems = Integer.parseInt(scanner.nextLine());
			ArrayList<Integer> items = new ArrayList<>();
			String[] itemTypes = scanner.nextLine().split(" ");
			for(int j = 0; j<numOfItems; j++) {
				items.add(Integer.parseInt(itemTypes[j]));
			}
			orders.add(new Order(items, deliverTo));
		}
		
	}
	
	public static Map getMap() {
		return map;
	}
}
