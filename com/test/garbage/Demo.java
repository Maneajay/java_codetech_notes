package com.test.garbage;

public class Demo {
protected void finalize() {
	System.out.println("object is detroyed ");
}
public Demo() {
	System.out.println("object is created ");
}

}
