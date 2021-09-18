class student{
    String s_name;
    String s_email;
    int s_number;
    float s_no;

    student(String a, String b, int c, float d){
        this.s_name=a;
         this.s_email=b;
          this.s_number=c;
          this.s_no=d;



    }
    public static void main(String[] args){
        student t1=new student("Aryan", "Ram", 52, 52431f);
        System.out.println(t1.s_email );
        System.out.println(t1.s_name );
        System.out.println(t1.s_number );
        System.out.println(t1.s_no);
    }
}