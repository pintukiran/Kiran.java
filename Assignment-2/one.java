/*22. write a java program to read 5 number from CLA and print only even number*/

class onr{
	public static void main(String[] args){
		for(int i=1; i<=args.length-1;i++){
			if(Integer.parseInt(args[i])%2==0){
				System.out.println(i);
			}
		}
	}
}
				
