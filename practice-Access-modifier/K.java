package pack1;
public class K{
	protected static void m1(){
		System.out.println("Class A - protected Method m1()");
	}
	
}


class B extends K{
	
	public static void main(String[] a){
		
		m1();
	}
	
}