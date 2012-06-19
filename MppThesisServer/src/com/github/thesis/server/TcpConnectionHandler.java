package com.github.thesis.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.github.thesis.server.constants.Constants;

public class TcpConnectionHandler implements Runnable {

	private Socket socket;

	public TcpConnectionHandler(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		System.out.println("Started new handler thread");
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		boolean logoutFlag = false;

		try {

			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());

			while (!logoutFlag) {
				// TODO add data exchange protocol
				
				String action = (String) in.readObject();
				System.out.println(action);
				
				if (action.equals(Constants.KEY_LOGOUT)) {
					logoutFlag = true;
				}
			}

		} catch (Exception e) {
			System.err.println("Exception while handling client: "
					+ e.getMessage());
		} finally {
			closeStreams(in, out);
		}
	}

	private void closeStreams(ObjectInputStream in, ObjectOutputStream out) {
		try {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (IOException e) {
			System.err.println("Exception while closing streams");
		}
	}

}
