package topic06;

import java.util.StringTokenizer;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s1 = "Today is a sunny day";
		 String s2 = "Today, is, a, sunny, day";
		 String s3 = "Today\\is\\a\\sunny\\day";
		 
		 StringTokenizer st1= new StringTokenizer(s1);
		 StringTokenizer st2= new StringTokenizer(s2, ",");
		 StringTokenizer st3= new StringTokenizer(s3, "\\", true);
		 
		 while( st1.hasMoreTokens() ) {
			 System.out.println( st1.nextToken() );
		 }
		 System.out.println();
		 
		 while( st2.hasMoreTokens() ) {
			 System.out.println( st2.nextToken().trim() );
		 }
		 System.out.println();
		 
		 while( st3.hasMoreTokens() ) {
			 System.out.println( st3.nextToken() );
		 }		
	}

}
