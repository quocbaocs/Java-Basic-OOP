package object_class;
//Java Program to demonstrate the use of an istance variable 

//which get memory each time when we create an object of the class 

public class Counter {
	int count = 0; // will get memory each time when the insntance is created

	Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// Creating objects
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}
}
