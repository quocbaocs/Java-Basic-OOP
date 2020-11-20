package arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(6);
		
		for(Integer i: list) {
			System.out.println(i);
		}
		ArrayList<Integer> a =(ArrayList<Integer>) list.clone();
		for(Integer i: a) {
			System.out.println(a);
		}
	}

}
