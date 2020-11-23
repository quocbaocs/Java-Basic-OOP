package word_this;

class Student2 {
	int rollno;
	String name;
	float fee;

	Student2(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2(111, "Le thanh hai", 1999);
		Student2 s2 = new Student2(121, "Le quoc bao", 1997);
		s1.display();
		s2.display();
	}
}
