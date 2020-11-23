package fileInputstream;

import java.io.FileInputStream;

public class DataStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("testout.txt");
		
			
			int i = 0; 
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
