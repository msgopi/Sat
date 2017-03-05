package javaconcepts;

public class D {
	
	int a=30;
	static int b=20;
	String name="shiva";
	long number=8500083049l;
	String city="bengulur";
	public void d1(){
		System.out.println("my name is"  + name);
		System.out.println("my number is"  + number);
		System.out.println("my city is"  + city);

	}
	public static void d2(){
		new D1().d3();
		new D().d1();
		System.out.println(new D().a*b);
		System.out.println(new D().name+new D().number);
	}
}
