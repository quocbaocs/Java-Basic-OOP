package socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("hello Server");
			dout.flush();
			dout.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
