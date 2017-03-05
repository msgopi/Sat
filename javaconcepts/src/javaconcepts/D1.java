package javaconcepts;

public class D1 extends D {
	int c=30;
	public void d3(){
	System.out.println(name+city);
	}
	public static void d4(){
		d2();
		System.out.println(new D().a*b*new D1().c);
	}
	public static void main(String[] args) {
	d4();
	
		
	}

}
