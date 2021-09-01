/*25 write a java program to print a Armstong number?*/

class Armstrng{
	public static void main(String[] args){
		int original=153;
		int n=153,x,y=0;
		while(n>0){
			x=n%10;
			x=x*x*x;
			y=y+x;
			n=n/10;
			System.out.println(x);
			
		}
	}
}

		