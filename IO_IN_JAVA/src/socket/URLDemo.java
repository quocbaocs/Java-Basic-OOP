package socket;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.howkteam.vn/");
			URLConnection urlConnection = url.openConnection();
			InputStream inputstream = urlConnection.getInputStream();
			int i = inputstream.read();
			while (i != -1) {
				System.out.println((char)i);
				i = inputstream.read();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
