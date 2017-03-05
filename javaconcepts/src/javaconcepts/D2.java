package javaconcepts;

public class D2 extends D{
	static D d=new D();
	static D1 s=new D1();
	public static void d5(){
		D1.d4();
		new D3().d8();
		System.out.println(d.a*b+s.c);
	}
	public static void d6(){
		d5();
		System.out.println(d.a+b*s.c);
	}
	public static void d7(){
		d6();
		System.out.println(d.a/b*s.c);
	}
	public static void main(String[] args) {
		
	d7();
}
}
