package week2_bai6;

public class Main {
	public static void main(String[] args) {
		Account acc1 = new Account("Ted Murphy", 72354, 102.56);
		Account acc2 = new Account("Jane Smith", 69713, 40.00);
		Account acc3 = new Account("Edward Demsey", 93757, 759.32);

		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println("\nGởi thêm số tiền cho acc1 là 25.85, cho acc2 là 500.00.");

		acc1.deposit(25.85);
		acc2.deposit(500);
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		System.out.println("\nRút khỏi acc2 số tiền là 430.75, mức phí 1.50.");

		acc2.withdraw(430.75, 1.5);
		System.out.println(acc2);

		System.out.println("\nTính tiền lãi cho acc3.");
		acc3.addInterest();
		System.out.println("\nXuất thông tin của acc1, acc2, acc3");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

	}

}
