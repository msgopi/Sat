package javaconcepts;

public class C extends B {
	
	public void c1(){
		System.out.println(a*(b+c));
		System.out.println("Iam nnon static");
	}
	public static void c2(){
		A m1=new A();
		 B m2=new B();
		 b2();
		System.out.println(m1.a+(b*m2.c));
		System.out.println((m1.a*b)+(m2.c));
	}
	public static void main(String[] args) {
		c2();
	}

}
