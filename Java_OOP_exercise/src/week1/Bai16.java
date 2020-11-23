package week1;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao a: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao b: ");
		int b = sc.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Vô số nghiệm (hay vô định)\n" + 
						"\n" + 
						"");
			}else if(b!=0) {
				System.out.println("Vô nghiệm");
			}
			
		}
		else {
			System.out.println("Phuong trinh co nghiem x: "+-b/a);
		}
	}

}
