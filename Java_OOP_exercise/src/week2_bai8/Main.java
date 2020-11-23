package week2_bai8;

import java.util.Scanner;

public class Main {
	public static CD NhapTay() {
		
		int ma = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap ma so SC");
		ma = scn.nextInt();
		// tiep tuc
		CD cdX = new CD(ma, "Chien dau", 10, 100);
		return cdX;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int luaChon;
		// new CD(maCD, tuaCD, tenCaSiCD, soBaiHat, giaThanh)
		CD cd1 = new CD(111, "Hoat Hinh", 10, 505);
		CD cd2 = new CD(113, "AHoat Hinh", 20, 208);
		CD cd3 = new CD(183, "Linh Hoat Hinh", 10, 505);
		CD cd4 = new CD(22, "BLinh Hoat Hinh", 10, 505);
		DSCD ds = new DSCD();
		ds.them(cd1);
		ds.them(cd2);
		ds.them(cd3);
		ds.them(cd4);

		do {

			System.out.println("=====*****************=====");
			System.out.println("1. Xuat danh sach CD.");
			System.out.println("2. Nhập tay CD");
			System.out.println("3. Sap xep theo số (Mã CD)");
			System.out.println("4. Sap xep theo chuỗi (Tựa CD)");
			System.out.println("5. Sap xep 2 thuôc tính giá thành và Tựa CD)");
			System.out.println("6. Tìm theo mã CD");

			System.out.println("=====Chon số khác kết thúc=====");
			luaChon = new Scanner(System.in).nextInt();

			switch (luaChon) {
			case 1:
				ds.XuatDS();
				break;
			case 2:
				CD cdnhap = NhapTay();
				ds.them(cdnhap);
				break;
			case 3:
				ds.SapXepTheoMa();
				;
				break;
			case 4:
				ds.SapXepTheoTuaCD();
				break;
			case 5:
				// trung gia thi tieu chuan 2 theo tua
				ds.sapXepGiaThanhVaTua();
				break;

			case 6:
				int maTim;
				System.out.println("Nhập mã cần tìm");
				maTim = new Scanner(System.in).nextInt();
				CD cdTim = ds.timCDRoom(maTim);
				if (cdTim != null)
					System.out.println(cdTim);
				else
					System.out.println("Không tìm thấy cd:\t" + maTim);
				break;
			default:
				luaChon = 0;// xử lý thoát
				break;
			}

		} while (luaChon != 0);
		System.out.println("chúc các em phát huy OOP");
		System.out.println("*********good bye*********");

	}
}
