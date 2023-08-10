package com.aurionpro.model;

import java.util.Objects;

public class Accounts {
int id;
String fName;
String lName;
int age;

public Accounts(int id, String fName, String lName, int age) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.age = age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Accounts [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + "]";
}

@Override
public int hashCode() {
	return Objects.hash(fName, id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Accounts other = (Accounts) obj;
	return Objects.equals(fName, other.fName) && id == other.id;
}


}
