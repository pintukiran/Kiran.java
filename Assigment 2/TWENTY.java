// 20 write a java program factors of 24 using while loop//
//ex:- factors of 24 are(1,3,4,6,12,24)//

class TWENTY{
	public static void main(String[] args){
		int number=24;
		int i=1;
		while(i<=number){
				
			if(number%i==0)
				System.out.println("number"+i);
				
			
		i++;
		}
	}
}
