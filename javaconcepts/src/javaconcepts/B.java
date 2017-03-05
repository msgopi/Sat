package javaconcepts;

public class B extends A{
	int c=25;
public void b1(){
	System.out.println(a*b*c);
	System.out.println("hi");
}
public static void b2(){
	A m1=new A();
	B m2=new B();
	A.a2();
	System.out.println((m1.a-b)+(m1.a-m2.c));
	System.out.println("iam seciond class");
}
public static void main(String[] args) {
	b2();
}
}
