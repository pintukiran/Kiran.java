/*class Test{
    Test(){
        System.out.println("constructor");
         //System.out.println("--constructor");
    }
    public static void main(String[] args){
        Test t=new Test();
         Test t1=new Test();
    }
}
*/
class Test{

    Test(){
        System.out.println("Hello");

    }
    class c extends Test{
     public static void main(String[] a){
        Test t=new Test();
    }
}