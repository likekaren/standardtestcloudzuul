package com.karen.standardservicecloud.po;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 多线程处理socket接收的数据
 * 
 */
public class SocketOperate extends Thread {
	private Socket socket;
 
	public SocketOperate(Socket socket) {
		this.socket = socket;
	}
 
	@SuppressWarnings("unused")
	public void run() {
		try {
			System.out.println("scoket创建成功");
			InputStream in = socket.getInputStream();
 
			PrintWriter out = new PrintWriter(socket.getOutputStream());
 
			// BufferedReader wt = new BufferedReader(new
			// InputStreamReader(System.in));
 
			while (true) {
				// 读取客户端发送的信息
				String strXML = "";
				byte[] temp = new byte[1024];
				int length = 0;
				while ((length = in.read(temp)) != -1) {
					strXML += new String(temp, 0, length);
				}
				if ("end".equals(strXML)) {
					System.out.println("准备关闭socket");
					break;
				}
				if ("".equals(strXML)) {
                    continue;
                }
 
				System.out.println("客户端发来：" + strXML.toString());
				out.write("收到");
				out.flush();
				out.close();
 
			}
			socket.close();
			System.out.println("socket stop.....");
 
		} catch (IOException ex) {
 
		} finally {
 
		}
	}
}

