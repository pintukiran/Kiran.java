class Two{
    public static void main(String []S){
        try{
            System.out.println(10/0);
        }
        
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}


 