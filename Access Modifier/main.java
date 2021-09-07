class main{
	public static void main(String[] A){
		int n=8;
		int x=0, y=1, z;
		System.out.println(x);
		System.out.println(y);
		for(int i=3;i<=n;i++){
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
	}
}
}