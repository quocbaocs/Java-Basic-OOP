package encapsulation;
//A Java class which is a fully encapsulated class 

// It has a private data member and getter and setter methods 

public class Student {
//private data member 
	private String college = "AKG";
	private String name;

	// Private method for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
}
