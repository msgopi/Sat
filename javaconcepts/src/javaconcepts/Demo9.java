package javaconcepts;

public class Demo9 {
	
	int a=30;
static int b= 50;
	String Name="shiva";
	static String friendname="gopi";
	static Demo9 m=new Demo9();
	public void m1(){
		System.out.println(a+b);
		System.out.println(Name);
		System.out.println(friendname);
	}
	public static void m2(){
		m.m1();
		System.out.println(m.a*b);
	}
			public static void m3(){
				m2();
				System.out.println(m.a+(m.a*b));
}
public static void main(String[] args) {
	m3();
	
}
}
