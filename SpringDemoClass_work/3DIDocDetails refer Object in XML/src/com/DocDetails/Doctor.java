package com.DocDetails;

public class Doctor {
String name;
String type;
Address ad;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Address getAd() {
	return ad;
}
public void setAd(Address ad) {
	this.ad = ad;
}
@Override
public String toString() {
	return "Doctor [name=" + name + ", type=" + type + ", ad=" + ad + "]";
}
public Doctor(String name, String type, Address ad) {
	super();
	this.name = name;
	this.type = type;
	this.ad = ad;
}
public Doctor(String name, String type) {
	super();
	this.name = name;
	this.type = type;

}
public Doctor(){
	
}
}
