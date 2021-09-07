package pack1;
public class A{
	protected static void m1(){
		System.out.println("Class A - protected Method m1()");
	}
	
}

class B extends A{
	
	public static void main(String[] a){
		
		m1();
	}
	
}