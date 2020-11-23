package word_this;

class Student5 {
	int rollno;
	String name, course;
	float fee;

	Student5(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student5(int rollno, String name, String course, float fee) {
		this(rollno, name, course);// reusing constructor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}

	public static void main(String[] args) {
		Student5 s1 = new Student5(111, "John", "Java");
		Student5 s2 = new Student5(222, "bao", "Python");
		s1.display();
		s2.display();
	}

}


