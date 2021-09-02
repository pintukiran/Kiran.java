/* write a java program to check given number is prime number or not?*/

class one{
	public static void main(String[] args){
		int number=5;
	   boolean prime=true;
		for(int i=2; i<number;i++){
		 if(number%i==0){
			prime=false;
			break;
		 }
		}
		System.out.println(prime);
	}
}
      