package object_class;
//Java program to illustrate the use off static variable which is shared with all objects.

class Counter2 {
	static int count = 0; // will get memory only once and retain its value

	Counter2() {
		count++; // increamenting the value of static variable
		System.out.println(count);
	}

	public static void main(String[] args) {
		// Creating objects
		Counter2 s1 = new Counter2();
		Counter2 s2 = new Counter2();
		Counter2 s3 = new Counter2();
	}
}
