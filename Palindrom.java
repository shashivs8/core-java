class Palindrom{

	public static void main(String args[]){
	
	int n=121, sum=0, r=0 , temp ;
	 temp=n;
	
	while (n>0){
	r= n%10;
	sum= sum*10 + r;
	n=n/10;
	
	}
	if(temp==sum){
	
	System.out.println("the number is palindrom");
				}
	else {
	
		System.out.println("the number is not a palindrom");

	}
	
	
	}

}