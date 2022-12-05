class SwapNumbers{

	public static void main (String args[]){
	
	int a=252;
	int b=352;
	System.out.println("BEFORE SWAP");
		System.out.println( a + " First number");
		System.out.println( b + " Second number");
		
	int temporary = a;
	 a = b;
	 b = temporary;
	
	System.out.println("AFTER SWAP");
		System.out.println( a + " First number");
		System.out.println( b + " Second number");

	}

}