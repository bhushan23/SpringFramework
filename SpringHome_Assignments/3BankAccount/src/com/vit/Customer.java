package com.vit;

public class Customer {
private String name;
private int ssn;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public Customer(String name, int ssn) {
	super();
	this.name = name;
	this.ssn = ssn;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [name=" + name + ", ssn=" + ssn + "]";
}

}
