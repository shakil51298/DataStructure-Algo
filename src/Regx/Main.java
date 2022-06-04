package Regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		// steps:  // 1 ==> Parrten//  2 ==> Match//  3 ==> find();
		String sentence = "First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.";
		Pattern pt = Pattern.compile("PATTERN", Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(sentence);
		boolean ifMatch = mt.find();
		if (!ifMatch) {
			System.out.println("not matched");
		}
		else {
			System.out.println("matched");
		}
		
	}
}
