package udp;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Esperar a mensagem
 * Imprime a mensagem no console
 * Lê do console
 * Envia a mensagem 
 * @author alkxyly
 *
 */
public class ChatUDp2 {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(3000);
			Scanner in = new Scanner(System.in);
			
			while(true){
				String mensagem  = in.nextLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
