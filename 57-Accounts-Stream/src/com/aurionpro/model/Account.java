package com.aurionpro.model;

public class Account {
int id;
String name;
double bankBalance;
Gender gender;
public Account(int id, String name, double bankBalance, Gender gender) {
	super();
	this.id = id;
	this.name = name;
	this.bankBalance = bankBalance;
	this.gender = gender;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

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
public double getBankBalance() {
	return bankBalance;
}
public void setBankBalance(double bankBalance) {
	this.bankBalance = bankBalance;
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", bankBalance=" + bankBalance + ", gender=" + gender + "]";
}


}
