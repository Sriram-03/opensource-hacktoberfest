// Java Program to Convert Chhar to String
// Using valueOf() method of String class

// Importing the required packages
import java.io.*;
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{
		// Declaring a char variable
		char c = 'G';
		
		// Converting char to String
		// using String.valueOf() method
		String s = String.valueOf(c);

		// Print and display the String s
		System.out.println(
			"Char to String using String.valueOf() method :"
			+ " " + s);
	}
}
