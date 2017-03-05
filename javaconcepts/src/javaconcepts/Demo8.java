package javaconcepts;

public class Demo8 {
int a=20;
static int b=30;
static Demo8 m=new Demo8();
public void m1(){
	m.m2();
	System.out.println(a*b);
}
public void m2(){
	System.out.println(a+b);
}
public static void m3(){
	m.m1();
	System.out.println(m.a+b);
}
public static void main(String[] args) {
m3();
}
}
