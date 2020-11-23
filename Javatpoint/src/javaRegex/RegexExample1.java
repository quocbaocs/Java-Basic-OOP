package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".as");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
	}
}
