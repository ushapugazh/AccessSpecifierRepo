package com.java.reflection.api;

public class ConcreteClass extends BaseClass implements BaseInterface  {
	
	public ConcreteClass(){
		
	}
	
	public ConcreteClass(int i){
		
	}
	public int publicInt;
	private String privateString="private string";
	protected boolean protectedBoolean;
	Object defaultObject;
	@Override
	public void method1() {
		System.out.println("Method1 impl.");
		
	}
	@Override
	public int method2(String str) {
		System.out.println("Method2 impl.");
		return 0;
	}
	
	@Override
	public int method4(){
		System.out.println("Method4 overriden.");
		return 0;
	}
	
	public int method5(int i){
		System.out.println("Method5 overriden.");
		return 0;
	}
	
	
	//inner classes for all the Access modifiers
	public class ConcreteClassPublicClass{}
	private class ConcreteClassPrivateClass{}
	protected class ConcreteClassProtectedClass{}
	class ConcreteClassDefaultClass{}
	
	//inner
	enum ConcreteClassDefaultEnum{}
	public enum ConcreteClassPublicEnum{}
	private enum PrivateEnum{}
	
	//member interface
	public interface ConcreteClassPublicInterface{}

}
