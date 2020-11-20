package week2_bai9;

import java.util.Scanner;

public class DanhSachSV {
	private SinhVien[] ds;

	public DanhSachSV() {

	}

	public void InputSinhVien() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong sinh vien: ");
		int n = sc.nextInt();
		ds = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh vien thu " + i);
			System.out.println("Input MSSV :");
			int mssv = sc.nextInt();
			System.out.println("Input Ho Ten: ");
			String ten = sc.nextLine();
			sc.nextLine();
			System.out.println("Input dia chi: ");
			String address = sc.nextLine();
			System.out.println("Input phone Number: ");
			int phone = sc.nextInt();
			ds[i] = new SinhVien(mssv, ten, address, phone);
		}
	}

	public void printDSSV() {
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
	}

	public void sortSinhVienay() {
		int n = ds.length;
		SinhVien temp;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (ds[j - 1].getMssv() > ds[j].getMssv()) {
					// swap elements
					temp = ds[j - 1];
					ds[j - 1] = ds[j];
					ds[j] = temp;
				}

			}
		}

	}

}
