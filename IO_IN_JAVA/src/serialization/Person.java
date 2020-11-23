package serialization;

import java.io.Serializable;

class Person implements Serializable {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Student1 extends Person {

	/**
	 * 
	 */
	
	String course;
	int fee;

	Student1(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}

}