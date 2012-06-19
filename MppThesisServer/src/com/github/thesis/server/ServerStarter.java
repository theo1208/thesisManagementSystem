package com.github.thesis.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.github.thesis.server.constants.Constants;

/**
 * Class that starts up server
 * @author MAKRANCZI Tamas
 * @author makranczitamas@gmail.com
 *
 */
public class ServerStarter {

	private ServerSocket serverSocket;

	/**
	 * Start method
	 */
	private void start() {
		Socket socket = null;
		
		System.out.println("**ServerStarter**: Server is up");
		
		try {
			serverSocket = new ServerSocket(Constants.TCP_SERVER_PORT);
			while (true) {
				socket = serverSocket.accept();
				System.out.println("**ServerStarter**: Received new connection, starting handler");
				
				new Thread(new TcpConnectionHandler(socket)).start();
			}
		
		
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ServerStarter().start();
	}

}
