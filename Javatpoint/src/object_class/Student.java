package object_class;

//Java Program to illustrate how to define a class and fields 
// Defining a Student class 
public class Student {
	//Defining fields 
	int id ;
	// field or data member or instance variable 
	String name="truong trung hoc";
	//Creating main method inside the Student class
	public static void main(String[] args) {
		//Creating an object or instance 
		Student s1 = new Student();//Creating an object of Student 
		//Printing values of the object
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
