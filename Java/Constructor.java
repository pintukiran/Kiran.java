class Emp{
 Emp(double a){
     this();
       System.out.println("A-class");
   }
   Emp(){
       
       System.out.println("B-class");
   }
   public static void main(String[] Args){
       Emp e=new Emp(10.5);

   }
}
