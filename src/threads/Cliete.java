package threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliete {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 4000);
		
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		DataInputStream dis = new DataInputStream(in);
		DataOutputStream dos = new DataOutputStream(out);
		
		dos.writeUTF("shao");
		dos.writeInt(6);
		dos.writeInt(10);
		
		for (int i = 0; i < 10; i++) {
			String msg = dis.readUTF();
			System.out.println(msg);
			
		}
	}
}
