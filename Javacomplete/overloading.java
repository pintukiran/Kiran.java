class T{
    public  void k(){

        System.out.println("no args");
    }
    public void k(double a){
        System.out.println("double args");
    }
    public void  k(int b){
      
        System.out.println("int args");
    }
    public static void main(String[] args){
        T t=new T();
        t.k();
        t.k(1);
        t.k(10.5);
    }
}