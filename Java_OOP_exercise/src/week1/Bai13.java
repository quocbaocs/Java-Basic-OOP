package week1;

import java.util.Scanner;

public class Bai13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n:");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum +i;
		}
		System.out.println("SUm = "+sum);
	}
}
