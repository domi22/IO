package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * �ַ���
 * @author Domi
 *
 */
public class Reader {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bf =null;  
		BufferedWriter bw = null;
		bf = new BufferedReader(new FileReader("Reader.txt"));
		bw = new BufferedWriter(new FileWriter("Writer.txt",true));
		
		//�����м����
		System.out.println(bf.ready());		
		String line;
		while((line = bf.readLine()) != null){
			bw.write(line);
			bw.newLine();//��ÿһ�м��ϻ��з�����֤��ʽ
            bw.flush();
		}		
		bw.close();
		bf.close();

	}

}
