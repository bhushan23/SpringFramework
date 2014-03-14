package com.vit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Movie {
String name;
String producer;
String director;
HashSet leadactor;
String leadactress;
HashMap info = new HashMap();
ArrayList songs = new ArrayList();
public String getName() {
	return name;
}
public Movie(String name, String producer, String director, HashSet leadactor,
		String leadactress, HashMap info, ArrayList songs) {
	super();
	this.name = name;
	this.producer = producer;
	this.director = director;
	this.leadactor = leadactor;
	this.leadactress = leadactress;
	this.info = info;
	this.songs = songs;
}
public HashMap getInfo() {
	return info;
}
public void setInfo(HashMap info) {
	this.info = info;
}
public void setName(String name) {
	this.name = name;
}
public String getProducer() {
	return producer;
}
public void setProducer(String producer) {
	this.producer = producer;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public HashSet getLeadactor() {
	return leadactor;
}
public void setLeadactor(HashSet leadactor) {
	this.leadactor = leadactor;
}
public String getLeadactress() {
	return leadactress;
}
public void setLeadactress(String leadactress) {
	this.leadactress = leadactress;
}
public ArrayList getSongs() {
	return songs;
}
public void setSongs(ArrayList songs) {
	this.songs = songs;
}
public Movie(String name, String producer, String director, HashSet leadactor,
		String leadactress, ArrayList songs) {
	super();
	this.name = name;
	this.producer = producer;
	this.director = director;
	this.leadactor = leadactor;
	this.leadactress = leadactress;
	this.songs = songs;
}
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}

}
