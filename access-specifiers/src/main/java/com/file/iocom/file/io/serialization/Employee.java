package com.file.iocom.file.io.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = -6470090944414208496L;

	private String name;
	private int id;
	transient private int salary;

	// getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee{name=" + name + ",id=" + id + ",salary=" + salary + "}";
	}


}
