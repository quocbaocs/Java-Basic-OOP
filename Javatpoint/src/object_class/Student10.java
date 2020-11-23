package object_class;
//Java Program to demonstrate the use of a static method.

public class Student10 {
	int rollno;

	String name;
	static String college = "ITS";

	// static method to change the value od steic variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Student10(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to displau values
	void display() {
		System.out.println(rollno + "" + name + " " + college);

	}

	// Test class to crewate and display the values of obojext
	public static void main(String[] args) {
		Student10.change();// calling change method
		// creating objects
		Student10 s1 = new Student10(111, "quoc bao");
		Student10 s2 = new Student10(222, "thanh nhan");
		Student10 s3 = new Student10(333, "thanh thanh");

		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}
