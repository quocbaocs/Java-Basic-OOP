package baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<String> studentList = new ArrayList<String>();

	public void addStudent(String student) {
		studentList.add(student);
	}

	public void displayStudentList() {
		System.out.println("In ra danh sachs cac sinh vien");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}

	public void removeStudent(int index) {
		studentList.remove(index);
	}

	public void modifyStudent(int index, String newStrudent) {
		studentList.set(index, newStrudent);
	}

	public String findStudent(String student) {
		if (studentList.indexOf(student) > 0) {
			int index = studentList.indexOf(student);
			return studentList.get(index);
		} else {
			return null;
		}
	}
}
