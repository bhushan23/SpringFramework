package com.spring1;

public class Emplyee {
int ID;
String name;
float salary;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Emplyee [ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
}
public Emplyee() {
	super();
	// TODO Auto-generated constructor stub
}

}
