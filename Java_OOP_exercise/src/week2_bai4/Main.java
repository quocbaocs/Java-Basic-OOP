package week2_bai4;

public class Main {
	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle("Nguyen Thu Loan", "Future Neo",100,35000000);
		Vehicle xe2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
		Vehicle xe3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500, 1000000000);
		String tieude = String.format("%-5s %-30s %10s %10s %10s", "Ten chu xe", "Loai xe", "Dung tich", "tri gia", "Thue phai nop");
		System.out.println(String.format(tieude));
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
	}

}
