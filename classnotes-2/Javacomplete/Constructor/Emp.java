class emp{
  int Acc_No;
  String Acc_Name;
  int Amount;  


emp(int a, String b, int c){
    this.Acc_No=a;
    this.Acc_Name=b;
    this.Amount=c;
  
}  

public static void main(String []A){
emp p=new emp(125, "kiran", 1000);
emp p1=new emp(125, "kiran", 1000);
emp p2=new emp(125, "kiran", 1000);
System.out.println(p.Acc_Name);
System.out.println(p1.Acc_No);
System.out.println(p2.Amount);

}
}

