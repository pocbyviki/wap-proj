package com.wap.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Parent parent = new Parent("Chandra Deo", 60);
		Child child = new Child("Vivek",32);
		
		serializeChild(child);
		deSerializeChild();
		serializeParent(parent);
		deSerializeParent();
	}

	public static void serializeChild(Child child) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("F:/child.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(child);
		oos.flush();
		oos.close();
	}
	public static void deSerializeChild() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("F:/child.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Child obj = (Child)ois.readObject();
		System.out.println(obj.getChildName()+" "+obj.getChildAge());
		System.out.println(obj.getParentName()+" "+obj.getParentAge());
		
		
	}
	
	/**
	 * 
	 * @param parent
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws NotSerializableException : becoz Parent does't implements Serializable 
	 */
	public static void serializeParent(Parent parent) throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("F:/parent.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(parent);
		oos.flush();
		oos.close();
	}
	public static void deSerializeParent() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("F:/parent.ser");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Parent obj = (Parent)ois.readObject();
		System.out.println(obj.getParentName()+" "+obj.getParentAge());
		
		
	}

}
