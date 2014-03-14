package com.info;

public class Person {
int pan;
String name;
String city;
float income;
public Person(){
	
	
}
public Person(int pan, String name, String city, float income) {
	super();
	this.pan = pan;
	this.name = name;
	this.city = city;
	this.income = income;
}

public Person(int pan, String name) {
	super();
	this.pan = pan;
	this.name = name;
	
}
public Person( String name,int income) {
	super();
	this.income = income;
	this.name = name;
	
}
@Override
public String toString() {
	return "Person [pan=" + pan + ", name=" + name + ", city=" + city
			+ ", income=" + income + "]";
}
public int getPan() {
	return pan;
}
public void setPan(int pan) {
	this.pan = pan;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public float getIncome() {
	return income;
}
public void setIncome(float income) {
	this.income = income;
}

}
