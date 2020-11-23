package word_this;

class Student3 {
	int rollno;
	String name;
	float fee;

	public Student3(int r, String n, float f) {
		// TODO Auto-generated constructor stub
		rollno = r;
		name = n;
		fee = f;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3(111, "le teo", 123);
		Student3 s2 = new Student3(121, "le bao", 531);
		s1.display();
		s2.display();
	}

}
