package helloword;

public class Simple {
	public static void main(String[] args) {
		a: for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 100) {
				System.out.println("Da thoat");
				break a;
			}
		}
	}

}
