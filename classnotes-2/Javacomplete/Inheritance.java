class p{
   public void k1(){
        System.out.println("p-class");
    } 
}
class c extends p{
   public void k2(){
        System.out.println("c-class");
    }
}
class text{
public static void main(String []A){
   c a=new p();
    a.k1();
    //a.k2();
}
}
