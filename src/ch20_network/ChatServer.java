package ch20_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// TCP통신, 1:1 콘솔버전
// 서버측 프로그램
public class ChatServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;	// 서비스 제공을 위한 소켓
		try {
			serverSocket = new ServerSocket(5555);	// 5555번 포트 개방
			System.out.println("서비스가 시작되었습니다.");
		} catch (Exception e) {
			System.out.println("서비스를 시작할 수 없습니다.");
			e.printStackTrace();
		}
		Socket clientSocket = null;	// 클라이언트와의 통신을 위한 소켓
		try {
			clientSocket = serverSocket.accept();	// 접속 허가 => 회선이 연결됨
			System.out.println("클라이언트의 ip 주소 : "
					+ clientSocket.getInetAddress().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 데이터 송수신을 위한 스트림 생성
		PrintWriter writer = new PrintWriter(
				clientSocket.getOutputStream(), true);
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(clientSocket.getInputStream()));
		
		String receive = "";
		String send = "Welcome!!";
		
		writer.println(send);	// 클라이언트에게 메시지를 보냄
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive = reader.readLine();	// 클라이언트의 메시지 수신
			// 종료 조건
			if(receive == null || receive.equals("quit")) {
				break;
			}
			System.out.println("[클라이언트] " + receive);
			System.out.print("입력하세요(종료:quit) : ");
			send = sc.nextLine();	// 키보드로 한줄 입력 
			writer.println(send);	// 클라이언트에게 메시지를 보냄
			if(send.equals("quit")) {
				break;
			}
		}
		// 리소스 정리
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
		
	}
}
