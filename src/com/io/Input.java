package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * �ֽ�����������
 * �ܱ��ֻ��и�ʽԭ�����
 * @author Domi
 *
 */
public class Input {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fi = null;
		FileOutputStream fo = null;
		
		fi = new FileInputStream("input.txt");
		fo = new FileOutputStream("output.txt", true);
		
		byte[] by = new byte[1024];
		int a;
		while ((a = fi.read(by)) != -1) {
			fo.write(by);//������aתΪchar���
	    }
		
		fo.close();
		fi.close();	
	}
}
