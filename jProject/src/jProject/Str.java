package jProject;

public class Str {

	String reverse(String a) {
		String result = "";
		char tmp = 'a';
		for (int i = a.length() - 1; i >= 0; i--) {
			tmp = a.charAt(i);
			result += tmp;
		}
		return result;
	}
}
