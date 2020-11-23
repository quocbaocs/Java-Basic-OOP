package inner;

class Test1 {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

}

class TestMain {
	public static void main(String[] args) {
		Test1 t = new Test1();

	}
}
