package word_this;

import object_class.Student10;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Student s1 = new Student(111, "Le thanh hai", 1999);
		Student s2 = new Student(121, "Le quoc bao", 1997);
		s1.display();
		s2.display();
	}
}
