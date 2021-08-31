/*Increment and Decrement operator
1 pre-increment(++a) and pre-Decrement(--a):- First increment then Assign
2 post-increment(a++) and post-Decrement(a--):-First Assign then Decrement
3 incr/decr operator Applicable only for variable not values
4 Nested incr/decr not possible 
   ex:- int a=10;
        int b=a++(++a);
		This is not possible 
		
5 incr/decr operator applicable for all primitive data type Except boolean

*/

//pre-increment//

class preincr{
	public static void main(String[] args){
		int x=10;
		int y=++x;
		System.out.println(x);
		System.out.println(y);
	}
}
		