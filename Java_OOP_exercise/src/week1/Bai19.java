package week1;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot chuoi: ");
		String chuoi = sc.nextLine();
		int dem = 0;
		for(int i = 0; i < chuoi.length(); i++) {
			if(chuoi.charAt(i)=='a') {
				dem = dem + 1;
			}
		}
		System.out.println(dem);
	}

}
