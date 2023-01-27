class MultiplyOf3{

	public static void main (String args[]){
		
			int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			
				for (int i=0 ; i<=a.length;i++){
					
					if (a[i]%3==0)
						{
						System.out.println( "Multiples of 3 " + a[i]);
						
					}
					if (a[i]%6==0){
						
						System.out.println("Multiples of 6 "  + a[i]);
						
					}
					
					
				}
		
	}

}