package week1;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Bai6 {
	public static void main(String[] args) {
		int result = 1 + 2;
		result = result - 1;
		result = result * 2;
		result = result /2;
		result = result + 8 ;
		result = result % 7;
		String firstString = "This is ";
		String secondString = " a concatenated string";
		String thirdString = firstString + secondString;
		System.out.print("final result: " + result+"\n");
		System.out.println(thirdString);
		
		int res = + 1;
		System.out.println(res);
		
		res--;
		System.out.println(res);
		
		res++;
		System.out.println(res);
		
		res = -res;
		System.out.println(res);
		
		boolean success = false;
		System.out.println(success);
		System.out.println(!success);
		System.out.println("----------------");
		
		int i = 3;
		i++;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(--i);
		System.out.println(i--);
		System.out.println(i);
		
		
		
		
	}

}
