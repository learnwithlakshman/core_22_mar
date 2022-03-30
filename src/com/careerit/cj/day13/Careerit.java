package com.careerit.cj.day13;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Careerit {

		public static PrintStream out;
		
		static {
			try {
				out = new PrintStream("one.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	
		
}
