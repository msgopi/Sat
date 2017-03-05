package javaconcepts;

public class A {
	int a=30;
	static int b=20;
public void a1(){
	System.out.println("hello");
	
}
public static void a2(){
	A m=new A();
	B m2=new B();
	m.a1();
	m2.b1();
	System.out.println((m.a+b)-(m.a-b));
	System.out.println("iam static");
}
}
