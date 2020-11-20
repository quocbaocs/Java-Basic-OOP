package arrayexercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so phan tu:");
		int soluong = sc.nextInt();
		int[] arr1 = InputArray(soluong);
		PrintArrayList(arr1);
		int sxarr[] = sortArray(arr1);
		PrintArrayList(sxarr);
		System.out.println("Nhap vao phan tu can them : ");
		int arrthem[] = addElementItem(sxarr);
		PrintArrayList(arrthem);
	}

	public static int[] InputArray(int soluong) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[soluong];
		for (int i = 0; i < soluong; i++) {
			System.out.println("Nhap vao phan tu " + i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void PrintArrayList(int[] arr) {
		System.out.println("xuat mang: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] sortArray(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return arr;
	}

	public static int[] addElementItem(int[] arr) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] destArray = new int[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			destArray[i] = arr[i];
			System.out.println("x : " + destArray[arr.length]);
		}

		destArray[destArray.length - 1] = x;
		return destArray;

	}

}
