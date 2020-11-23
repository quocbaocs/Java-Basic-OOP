package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

//class Persist {
//	public static void main(String[] args) {
//		try {
//			// creating the object
//			Student s1 = new Student(211, "quoc bao");
//			// Creating stream and wrriting the object
//			FileOutputStream fout = new FileOutputStream("f.txt");
//			ObjectOutputStream out = new ObjectOutputStream(fout);
//			out.writeObject(s1);
//			out.flush();
//			out.close();
//			System.out.println("success....");
//		} catch (Exception e) {
//			System.out.println(e);
//			// TODO: handle exception
//		}
//	}
//}

class Depersist {
	public static void main(String[] args) {
		try {
			// Creating stram to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s = (Student) in.readObject();
			System.out.println(s.id + " " + s.name);
			// closing the stream
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
