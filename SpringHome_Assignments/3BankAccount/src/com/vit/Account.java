package com.vit;

import java.util.ArrayList;

public class Account {
public int accno;
public String type;
public float bal;
public ArrayList<Customer> customer;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public float getBal() {
	return bal;
}
public void setBal(float bal) {
	this.bal = bal;
}
public ArrayList<Customer> getCustomer() {
	return customer;
}
public void setCustomer(ArrayList<Customer> customer) {
	this.customer = customer;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Account [accno=" + accno + ", type=" + type + ", bal=" + bal
			+ ", customer=" + customer + "]";
}

}
