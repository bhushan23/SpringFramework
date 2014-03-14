package com.spring1;

public class Customer {
int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
String name;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [custid=" + id + ", name=" + name + "]";
}

}
