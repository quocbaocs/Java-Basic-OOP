package week1;

import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao so");
		int so = sc.nextInt();
		
		if(so==0){
			System.out.println("so 0");
		}
		else if(so%2==0) {
			System.out.println("so chan");
		}
		else if(so%2!=0) {
			System.out.println("so le");
		}
	}

}
