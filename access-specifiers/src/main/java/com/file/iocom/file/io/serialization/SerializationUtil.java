package com.file.iocom.file.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {


		public static Object deserialize(String fileName) throws IOException,
				ClassNotFoundException {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			ois.close();
			return obj;
		}

		public static void serialize(Object obj, String fileName)
				throws IOException {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			fos.close();
		}
	public static void main(String[] args) {
		String fileName="employee.txt";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Usha Pugazhenthi");
		emp.setSalary(5000);
		
		//serialize to file
		try {
			SerializationUtil.serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		Employee empNew = null;
		try {
			empNew = (Employee) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}

	}

