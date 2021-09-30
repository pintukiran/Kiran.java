class A{
     Object k1(){
        System.out.println("A-Hello");
        return null;
    }
}
class B extends A{
String k1(){
        System.out.println("B-Hello");
           return null;
}
 }
 class text{   
    public static void main(String[] args){
        B b=new B();
        b.k1();
    }
    }

