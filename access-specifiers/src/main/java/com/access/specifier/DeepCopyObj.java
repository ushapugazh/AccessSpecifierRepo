package com.access.specifier;

class Subject1 {
    String name;
    public Subject1(String name) {     this.name = name;} 
}

class Student1{
	Subject1 sub;
	String StudentName;
	
	Student1(String StudentName, Subject1 sub){
		this.StudentName =StudentName;
		this.sub = new Subject1(sub.name);//deep Copy changes
	}
	
}
public class DeepCopyObj {
	public static void main(String[] args) {
		Subject1 sub = new Subject1("Java");
		Student1 st = new Student1("Usha",sub);
		System.out.println("Through Student sub is : " +st.sub);
		System.out.println("Directy from Subject" + sub);
	}
}
