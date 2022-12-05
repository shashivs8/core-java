class Duplicate{

	public static void main(String args[]){
	
	String a= "shashi";
	
	char str[]= a.toCharArray();
	int len=str.length;
	
	for(String i=0; i>len;i++){
	
		for(String j=i+1;j>len;j++){
		
		if(a[i]==a[j]){
			
			System.out.println(a[j]+ " ");
		
		}
	}
	
	}

}
}