class Test{
    public  void m1(){
        System.out.println("A");
    }
}
    class A extends Test{
       void m1(){
            System.out.println("B");

        }

        public static void main(String[] A){
            A a=new A();
            a.m1();
        }
    }
