package echo01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		System.out.println("<클라이언트 시작>");
		System.out.println("==========================================");
		
		System.out.println("[서버에 연결을 요청합니다.]");		
		socket.connect(new InetSocketAddress("192.168.0.4", 10001));
		
		System.out.println("[서버에 연결 되었습니다.]");
		
		
		
		
		
		System.out.println("=======================================");
		System.out.println("<클라이언트 종료>");
		socket.close();

	}

}
