package week1;

import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao n: ");

		int n = sc.nextInt();

		int chan = 0;
		int le = 0;
		int i = 0;

		while (i < n) {
			if (i % 2 == 0) {
				chan = chan + i;
			}
			if (i % 2 != 0) {
				le = le + i;
			}
			i=i+1;

		}
		if(n%2==0) {
			System.out.println("chan : "+chan);
		}else {
			System.out.println("le : "+le);

		}
		
	}

}
