package baitap;

import java.util.Scanner;

public class Main {
	private static StudentList studentList = new StudentList();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Chuong trinh quan li sinh vien:");
	
		boolean flag = true;
		
		do {
			printMenu();
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				studentList.displayStudentList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				seachItem();
				break;
			case 6:
				flag = false;
				break;
			}
		} while (flag);
	}

	public static void printMenu() {
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of student items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	public static void addItem() {
		System.out.println("Nhap thong tin sinnh vien ban can them: ");
		String student = sc.nextLine();
		studentList.addStudent(student);
	}

	public static void modifyItem() {
		System.out.println("Nhap vao so thu tu sinh vien ban muon thay doi: ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap vao ten sinh vien moi");
		String newStudent = sc.nextLine();
		studentList.modifyStudent(index, newStudent);
	}

	public static void removeItem() {
		System.out.println("Nhap vao so thu tu sinh vien ban muon xoa: ");
		int index = sc.nextInt();
		studentList.removeStudent(index);
	}

	public static void seachItem() {
		System.out.println("Nhap vao ten sinh vien ban muon tim");
		String student = sc.nextLine();
		String findStudent = studentList.findStudent(student);
		if (findStudent != null) {
			System.out.println("sinh vien co ten la: " + student);
		} else {
			System.out.println("khong tim thay sinh vien ten la: " + student);
		}
	}

}
