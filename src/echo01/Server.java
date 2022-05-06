package echo01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.4", 10001));
		
		System.out.println("<서버시작>");
		System.out.println("======================================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		Socket socket = serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		
		
		
		
		System.out.println("<서버종료>");
		socket.close();
		serverSocket.close();

	}

}
