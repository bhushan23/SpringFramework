package com.vit;

public class Student {
String name;
Mydate DOB;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Mydate getDOB() {
	return DOB;
}
public void setDOB(Mydate dOB) {
	DOB = dOB;
}
public Student(String name, Mydate dOB) {
	super();
	this.name = name;
	DOB = dOB;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", DOB=" + DOB + "]";
}

}
