package javaconcepts;

public class Test {
	

	
	public void c1(){
	
		System.out.println("iam non static");
	}
public static void main(String[] args) {	
	A a=new A();
	a.a1();
	A.a2();
	B b=new B();
	b.b1();
	B.b2();
	Test c=new Test();
	c.c1();
	D d=new D();
	d.d1();
}
}
