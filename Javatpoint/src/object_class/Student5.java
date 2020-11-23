package object_class;
//Java program to demonstrate the use of the parameterized constructor

class Student5 {
	int id;
	String name;

	// createing a paremeterized constructor
	Student5(int i, String n) {
		id = i;
		name = n;
	}

	// Method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// creating objects and passingn values
		Student5 s1 = new Student5(111, "quoc bao");
		Student5 s2 = new Student5(222, "thanh cong");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
}
