package week1;

import java.util.Random;

public class RandomJava {
	public static void main(String[] args) {
		Random r = new Random();
		int rand = r.nextInt();
		System.out.println(rand);
	}
}
