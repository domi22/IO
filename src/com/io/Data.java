package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 字节流，
 * 用于：图片，视频，音频...
 * @author Domi
 *
 */
public class Data {

	public static void main(String[] args) throws Exception {
		
		    DataInputStream dis = null;
		    DataOutputStream dos = null;
		
			dis = new DataInputStream(new FileInputStream("pic.png"));
		    dos = new DataOutputStream(new FileOutputStream("copy.png"));
			
		    byte[] by = new byte[1024];
		    int len;
			while((len = dis.read(by)) != -1)
			{
				dos.write(by);
	        }
			
			dos.close();
			dis.close();
		
	}

}
