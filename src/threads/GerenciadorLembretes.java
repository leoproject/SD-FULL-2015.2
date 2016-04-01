package threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class GerenciadorLembretes {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4000);
		
		while (true) {
			Socket s = ss.accept();
			Lembrete l = new Lembrete(s);
			l.start();
		}

	}

}
