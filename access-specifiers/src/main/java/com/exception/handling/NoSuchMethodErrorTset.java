package com.exception.handling;

class A {
    public void methodA() {
        System.out.println("Method A in version 1");
    }
}

// Class B
class B {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
         // Assume class A is updated and methodB is added in version 2, but class B is not recompiled
        // a.methodB(); // This line would cause NoSuchMethodError if class A is version 2
    }
}


public class NoSuchMethodErrorTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
