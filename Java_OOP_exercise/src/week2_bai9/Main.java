package week2_bai9;

import interface_java.Manager;

public class Main {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien(1, "Le quoc bao", "HCM", 0134567);
		System.out.println(sv);

		DanhSachSV ds = new DanhSachSV();
		ds.InputSinhVien();
		System.out.println("-----------------------");
		ds.printDSSV();
		System.out.println("danh sach sau khi sap xep");
		ds.sortSinhVienay();
		ds.printDSSV();

	}

}
