/*24 write a program to check a given number is Armstrong number or not?
logic:-
      original=153
      n=153   temp  temp^3
	  Armstrong+temp;
	  n%10;
	  //now temp value is 3//
	  temp=temp*temp*temp;
	  Armstrong=Armstrong+temp;
	  n/10;
	  loop n==0
	  if(Armstrong==original){
	  sop(Armstrong);
	  }
	  else{
		  sop(not Armstrong);
	  }
	  
	  
       */
class Armstrong{
	public static void main(String[] args){
		int n=153,temp,Armstrong=0;
		int original=n;
	
		
		while(n>0){
		temp=n%10;
		
		temp=temp*temp*temp;
		Armstrong=Armstrong+temp;
		n=n/10;
	    }
		if(Armstrong==original){
			System.out.println("Given number is Armstrong"      );
		}
		else{
			System.out.println("Given number is not a Armstrong number");
		}
	}
}

		