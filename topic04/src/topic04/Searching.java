package topic04;

import java.util.Scanner;

import java.util.Scanner;

public class Searching {
	
	boolean result = false;	
	
	boolean isExist(String data, String[] source) {
		
		String[] method = {"foreach"};
		
		Scanner s = new Scanner(System.in);		
		System.out.printf("Available method:\n*%s  %n", method[0] );
		System.out.print("Your choice is: > ");
		String selection = s.next();
		
		if( selection.equals("foreach") ) {
			for(String tmp : source) {
				if( tmp == data ) {
					result = true;
					break;
				}
				System.out.println("Current fruit: " + tmp +" \t "+ data +" is not in the array.");
			}			
		}
		
		return false;
	}
	
}
