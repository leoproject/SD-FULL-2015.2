package threadTcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorLembrete {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9000);
		
		while (true) {
			Socket socket = ss.accept();
			Lembrete l = new Lembrete(socket);
			l.start();
		}
		
	}
}
