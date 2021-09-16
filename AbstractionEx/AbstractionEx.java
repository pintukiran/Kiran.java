abstract class RBI{
    public void open_Account(){
        System.out.println("opened Account successfully");
    }
    public void close_Account(){
        System.out.println("closed Account Successfully");
    }
    public abstract int cal_Interest();
}
class SBI extends RBI{
    public int cal_Interest(){

        System.out.println("SBI Interest Rates: 7");
        return 7;
    }
}
class HDFC extends RBI{
    public int cal_Interest(){

        System.out.println(" HDFC Interest Rates: 5");
        return 5;
    }
}
class Canara extends RBI{
    public int cal_Interest(){

        System.out.println(" Canara Interest Rates: 4");
        return 4;
    }
}
public class AbstractionEx{
    public static void main(String[] args){
     SBI sbi=new SBI();
     sbi.open_Account();
     sbi.close_Account();
     sbi.cal_Interest();
     System.out.println("---------------------------------------");
     HDFC hdfc=new HDFC();
     hdfc.open_Account();
     hdfc.close_Account();
     hdfc.cal_Interest();
     System.out.println("////////////////////////////////////////////");
     Canara canara=new Canara();
     canara.open_Account();
     canara.close_Account();
     canara.cal_Interest();
    }
}