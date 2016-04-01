package udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import java.util.Scanner;

public class ChatUDp1 {


	public static void main(String[] args){
		try {
			
			DatagramSocket socket = new DatagramSocket(5000); // reserva a porta 3000
			Scanner se = new Scanner(System.in);
			
			while (true) {
				System.out.println("Digite a mensagem: ");
				String mensagem = se.nextLine();
				byte[] buffer = mensagem.getBytes();
				
				DatagramPacket pacote = new DatagramPacket(buffer, buffer.length,InetAddress.getLocalHost(),3000); //monta o pacote udp
				socket.send(pacote); // envia pacote
				
				byte[] byfR = new byte[50];
				DatagramPacket pR = new DatagramPacket(byfR,byfR.length);
				socket.receive(pR); //recebe pacote
				
				String msgR = new String(pR.getData());
				System.out.println("Mensagem : "+msgR);
				
			}
		
			

		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
