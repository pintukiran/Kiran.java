/*fibonacii series*/

class fib{
	public static void main(String[] args){
		int N=7;
		int x=0;
		int y=1;
		int z;
		System.out.println(x);
		System.out.println(y);
		for(int i=2; i<=N; i++){
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}
}
		