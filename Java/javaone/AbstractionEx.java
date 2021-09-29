 abstract class RBI{
    public void open_Account(){
       System.out.println("opened Account Successfully");
    }
    public void close_Account(){
        System.out.println("closed Accout Successfully");

    }
    public abstract int cal_interest();
}
class SBI extends RBI{
    public int cal_interest(){
        System.out.println("SBI interest Rates : 7");
        return 7;
    }
}
class HDFC extends RBI{
    public int cal_interest(){
        System.out.println("HDFC interest Rates : 8");
        return 8;
    }

}
public class AbstractionEx{
    public static void main(String[] args){
        SBI sbi=new SBI();
        sbi.cal_interest();
        sbi.open_Account();
        sbi.close_Account();
        System.out.println("///////////////////////////////////////////");
       HDFC hdfc=new HDFC();
       hdfc.cal_interest();
        hdfc.open_Account();
       hdfc.close_Account();
   }
}
