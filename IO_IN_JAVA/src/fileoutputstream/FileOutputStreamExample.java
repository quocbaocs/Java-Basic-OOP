package fileoutputstream;

import java.io.FileOutputStream;

//public class FileOutputStreamExample {
//	public static void main(String[] args) {
//		try {
//			FileOutputStream out = new FileOutputStream("out.txt");
//			out.write(5);
//			out.close();
//			System.out.println("success...");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//
//}

class FileOutputStreamExample {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("testout.txt");
			String s = "Welcome to javatpoint.";
			byte b[] = s.getBytes();
			out.write(b);
			out.close();
			System.out.println("success....");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}