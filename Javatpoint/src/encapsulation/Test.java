package encapsulation;
//A class to test the encapsualted class

public class Test {
	public static void main(String[] args) {
		// creating instance of the encapsualted class
		Student s = new Student();
		// setting value in the name member
//		s.setName("quoc bao");
		// Getting value of the name member
//		System.out.println(s.getName());
		s.setCollege("quocbao");
		System.out.println(s.getCollege());
		Class fl = s.getClass();
		System.out.println(fl);
		System.out.println(s.hashCode());
		Student a = new Student();
		System.out.println(s.hashCode());
		
		
	}

}
