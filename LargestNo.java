public class Ascending {
	
		class LargestNo{
		public static void  main(String args[]){
		
		int a[]={5,8,9,4,2,3,1,10,11,22}; 
		int n;
		n=a.length;
		
		int i,j, temp, k;  	
		
		
		for(i=0 ; i<a.length ; i ++){
		
			for(j=i+1;j<a.length;j++){
			
			if(a[i]<a[j]){
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			}
			}
		}
		for (int s =0; s<a.length;s++)
	
			System.out.print(a[s] + " ");
		System.out.println("Third largest Number " + a[2]);
	     
		}

	}