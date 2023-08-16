package com.aurionpro.model;

public class Rectangle implements Shape{
int height;
int width;

public Rectangle(int height, int width) {
	super();
	this.height = height;
	this.width = width;
}

@Override
public String toString() {
	return "Rectangle [height=" + height + ", width=" + width + "]";
}



}
