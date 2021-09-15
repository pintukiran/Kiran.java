interface RBI{
    public void open_Account();
    public void close_Account();
    public int cal_Interest();

}
class SBI implements RBI{
   public void open_Account(){
        System.out.println("opened Account Successfully");
       
    }
    public void close_Account(){
        System.out.println("closed Account Sccessfully");
       
    }
    public int cal_Interest(){
        System.out.println("SBI Interest Rates: 6");
        return 6;
    }
}
class HDFC implements RBI{
   public void open_Account(){
        System.out.println("opened Account Successfully");
       
    }
    public void close_Account(){
        System.out.println("closed Account Sccessfully");
       
    }
    public int cal_Interest(){
        System.out.println("HDFC Interest Rates: 7");
        return 6;
    }
}
public class RBIInterfaceEX{
    public static void main(String[] args){
        SBI sbi=new SBI();
        sbi.open_Account();
        sbi.close_Account();
        sbi.cal_Interest();
        System.out.println("--------------------------");
        HDFC hdfc=new HDFC();
        hdfc.open_Account();
        hdfc.close_Account();
        hdfc.cal_Interest();


    }
}