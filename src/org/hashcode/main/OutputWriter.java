package org.hashcode.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputWriter {
	private Map map = InputReader.getMap();

	public void writeOutput() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output.txt")));
		bw.
	}
}
