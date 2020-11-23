package generic_java;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
//		list.add("quocbao");
		for(int i: list) {
			System.out.println(i);
		}
	}

}
