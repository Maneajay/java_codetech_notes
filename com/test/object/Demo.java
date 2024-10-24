package com.test.object;

public class Demo implements Cloneable {
int x;
public static void main(String[] args)throws CloneNotSupportedException {
	Demo demo=new Demo();
	demo.x=20;
	System.out.println(demo.x);
	
	
	Demo demo1=(Demo) demo.clone();
	System.out.println(demo1);
}
@Override
public String toString() {
	return "Demo [x=" + x + "]";
}

}
