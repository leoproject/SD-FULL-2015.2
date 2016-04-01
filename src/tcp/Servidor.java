package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		try {
			// socket bind listen
			ServerSocket serverSocket =  new ServerSocket(7000);
			
			Socket socket = serverSocket.accept();//bloqueante, se não estiver na fila o servidor vai ficar parado esperando a conexão
			
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();
			
			byte[] buf = new byte[inputStream.available()];
			
			int tamanhoMensagem =  inputStream.read(buf,0,buf.length);
			
			
//			System.out.println(tamanhoMensagem);
			
			System.out.println(new String(buf));
			
			outputStream.write("Oi!".getBytes());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
