abstract class Two{
    abstract void m1();
    System.out.println("A_Hello");
}
class B extends Two{
    abstract void m1(){
        System.out.println("B_Hello");
    }
}