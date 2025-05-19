package com.access.specifier;

class Subject {
    String name;
    public Subject(String name) {     this.name = name;} 
}

class Student{
	Subject sub;
	String StudentName;
	
	Student(String StudentName, Subject sub){
		this.StudentName =StudentName;
		this.sub = sub;// shallow copy changes
	}
	
}

public class ShallowCopy {
	public static void main(String[] args) {
		Subject sub = new Subject("Java");
		Student st = new Student("Usha",sub);
		System.out.println("Through Student sub is : " +st.sub);
		System.out.println("Directy from Subject" + sub);
	}
	 
	 
	
	  

}
