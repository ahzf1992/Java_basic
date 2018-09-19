package qiuzhao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class test_serializalble {
	

		public static void main(String[] args) throws Exception{

		writeObj();

		readObj();

		}

		public static void readObj()throws Exception{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

		Object obj = ois.readObject();//��ȡһ������

		System.out.println(obj.toString());

		}

		public static void writeObj()throws IOException{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

		oos.writeObject(new Person("lisi",25)); //д��һ������

		oos.close();

		}

		}

		class Person implements Serializable{

		private static final long serialVersionUID = 42L;

		private transient String name;//��transient���κ�name������������л�

		public int age;

		Person(String name,int age){

		this.name = name;

		this.age = age;

		}

		public String toString(){

		return name+"::"+age;

		}

		}

