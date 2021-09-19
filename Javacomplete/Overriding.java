class P{
    public void m1(){
        System.out.println("no agr-1");
    }
    public void m1(int a){
    System.out.println("no arg-2");
    }
}
class C extends P{
    public void m1(){
    System.out.println("p-no args");
    }
}
class Test{
public static void main(String[] A){
   
  C c=new C();
   c.m1();
}

}