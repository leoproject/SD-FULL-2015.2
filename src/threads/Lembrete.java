package threads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Lembrete extends Thread {
	private String nome;
	private int intervalo;
	private int  total;
	private Socket socket;
	public Lembrete(String nome, int intervalo, int total) {
		super();
		this.nome = nome;
		this.intervalo = intervalo;
		this.total = total;
	}
	public Lembrete(Socket s) {
		this.socket = s;
	}
	@Override
	public void run(){

		try {
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			
			String nome = dis.readUTF();
			int interv = dis.readInt();
			int total = dis.readInt();
			
			for (int i = 1; i <= total; i++) {
				dos.writeUTF("Tomar "+nome+i);
				Thread.sleep(interv*1000);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Aula anterior

		//		for (int i = 0; i < this.total; i++) {
		//			System.out.println("Tomar "+this.nome+" "+i);
		//			try {
		//				Thread.sleep(this.intervalo * 10000);
		//			} catch (InterruptedException e) {
		//				e.printStackTrace();
		//			}
		//		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}


}