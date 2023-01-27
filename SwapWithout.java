class SwapWithout{


	public static void main (String args[]){
	
	int a=10;
	int b=20;
	
	System.out.println("BEFORE SWAP");
		System.out.println( a + " First number");
		System.out.println( b + " Second number");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after SWAP");
		System.out.println( a + " First number");
		System.out.println( b + " Second number");
	
	}

}