package http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteHttp {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("www.ufs.br",80);
			
			String msg = "GET / HTTP/1.1"+"\r\n"+"Host:sigaa.ufs.br"+"\r\n"+"\r\n";
			
			InputStream input = socket.getInputStream(); //receber respostar pelo canal de entrada
			OutputStream out = socket.getOutputStream(); //enviar 
			
			byte[] buf = msg.getBytes();
			out.write(buf);
			
			byte[] bufR = new byte[256]; //Montar pequeno buffer para que busque enquanto o servidor manda os bytes.
			
			int tam = 0;
			String resp = null;
			while((tam = input.read(bufR)) > -1){
				resp = new String(bufR,0,tam);
				System.out.print(resp);
				
			}
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
