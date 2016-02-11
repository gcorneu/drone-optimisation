package org.hashcode.main;

import java.io.FileNotFoundException;

public class App {
    public static void main(String args[]) throws FileNotFoundException {
    	InputReader.readFile("mother_of_all_warehouses.in");
    	
        System.out.println("Hello World!");
        IMap mapper = new Map(0, 0, 0, 0, 0);
    	while(mapper.getCurrentTime() != mapper.getMaxTime()){
    		
    	}
    }
}
