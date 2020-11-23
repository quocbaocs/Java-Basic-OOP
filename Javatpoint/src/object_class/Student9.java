package object_class;
//Java Program to demonstrate the use of static variable 

class Student9 {
	int rollno; // instance variable
	String name;
	static String college = "ITS";// Static vaiable
	// constructor

	Student9(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	// Test class to show the values of objects
	public static void main(String[] args) {
		Student9 s1 = new Student9(111, "quoc bao");
		Student9 s2 = new Student9(222, "thanh nhan");

		// we can change the college of all bojexts by the single line of code

		s1.display();
		s2.display();
	}
}
