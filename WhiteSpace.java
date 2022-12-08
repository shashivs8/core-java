package com.xworkz.presentationapp;


public class WhiteSpace {
	
	public static void main(String args[]){
	    String n = "a b c d";
	    int space=0;
	    String n2="";
	   
	    for(int i=0; i<n.length(); i++){
	    char ch=n.charAt(i);
	     if(ch==' '){
	            space++;
	        }
	     if(ch!=' ') {
	    	 
	    	 n2=n2+n.charAt(i);
	    	 
	     } else {
	    	 
	    	 continue;
	     }
	   
	     
	    }
	    
	    System.out.println("Total white space : "+space);
	    System.out.println("After remove space " + n2);
	   
	    }
	}


