package javaconcepts;

public class Demo7 {
public void m1(){
	m2();
	m3();
	System.out.println("hello");
	
}
public static void m2(){
	System.out.println("hi");
}
public void m3(){
	m2();
	System.out.println("iam non static");
}
public static void main(String[] args) {
	Demo7 m=new Demo7();
	m.m1();
}
}
