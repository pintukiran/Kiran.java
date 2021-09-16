interface RBIInterfaceEX{
     void open_Account();
     void close_Account();
     int cal_Interest();
}

class SBI implements RBIInterface{
    public void open_Account(){
        System.out.println("SBI - Opened Account Successfully");
    }
      public void close_Account(){
        System.out.println("SBI -Closed Account Successfully");
    }
      public int cal_Interest(){
        System.out.println(" SBI Interest Rates - 7");
        return 0;
    }
}
    class Canara implements RBIInterface{
    public void open_Account(){
        System.out.println("Canara - Opened Account Successfully");
    }
      public void close_Account(){
        System.out.println("Canara -Closed Account Successfully");
    }
      public int cal_Interest(){
        System.out.println(" Canara Interest Rates - 7");
        return 0;
    }
}
public class InterfaceEx{
    public static void main(String[] args){

        SBI sbi = new SBI();
        sbi.open_Account();
        sbi.cal_Interest();
        sbi.close_Account();

       System.out.println("..................");

        Canara canara = new Canara();
        canara.open_Account();
        canara.cal_Interest();
        canara.close_Account();
    }
}
