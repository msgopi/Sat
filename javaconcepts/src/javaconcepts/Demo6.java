package javaconcepts;

public class Demo6 {
 int a=30;
 static int b=20;
 public static void m1(){
	 int c=25;
	 System.out.println(b*c+b);
 }
 public void m2(){
	 int d=35;
	 System.out.println(a*b+d);
 }
 public void m3(){
	 int e=45;
	 System.out.println(a*e+b);
 }
 public static void main(String[] args) {
	Demo6 m=new Demo6();
	m1();
	m.m2();
	m.m3();
}
}
