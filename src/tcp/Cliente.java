package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		try {
			// Socket  =  Socket , Bind  e Connect
			Socket socket = new Socket("localhost",7000);
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String msg = "mensagem";
			
			out.write(msg.getBytes());
//			System.out.println("Menage do servidor");
			byte[] entrada = new byte[in.available()];
			in.read(entrada, 0, entrada.length);
			
			System.out.println(new String(entrada));
			socket.close();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
