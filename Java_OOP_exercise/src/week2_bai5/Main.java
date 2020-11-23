package week2_bai5;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
	
		HangThucPham hang1 = new HangThucPham("001","Gao", 1543534,LocalDate.of(2018,10,7),LocalDate.of(2018,10,7));
		HangThucPham hang2 = new HangThucPham("002","Mi", 500000,LocalDate.of(2018,3,1),LocalDate.of(2018,9,1));
		HangThucPham hang3 = new HangThucPham("003","Nước", 10000,LocalDate.of(2018,3,1),LocalDate.of(2018,3,1));
		String tieude = String.format("%-10s %-15s %-15s %10s %15s %20s\n","Mã Hàng", "Tên Hàng", "Đơn Giá", " Ngày Sản Xuất", "Ngày hết hạn", "Ghi Chú");
		System.out.println(tieude);
		System.out.println(hang1);
		System.out.println(hang2);
		System.out.println(hang3);
	}

}
