package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Student;

/**
 * 序列化对象
 * @author Domi
 *
 */
public class Object {
	
	public static void main(String[] args) throws Exception{
	
		//writeObject();
		readObject();
	}
	
	/**
	 * 读取序列化对象
	 */
	public static void readObject() throws Exception{
		
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream("object.txt"));
		ArrayList<Student> studentlis = (ArrayList<Student>) 
		ois.readObject();
		for(Student s:studentlis){
			System.out.println(s.name+","+s.age);
		}
		
		ois.close();
	}
	
	
	/**
	 * 保存序列化对象
	 */
	public static void writeObject() throws Exception{
		
		ObjectOutputStream oos =null;
		oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
		
		Student st1 = new Student("zhangsan", 32);
		Student st2 = new Student("lisi", 54);
		List<Student> ls = new ArrayList<Student>();
		ls.add(st1);
		ls.add(st2);
		oos.writeObject(ls);
		oos.flush();
		oos.close();
	}
	
}
