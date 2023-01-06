package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MaxAndMin {

	
	  public static int Integermin(List<Integer> list) {
	  
	  if(list==null || list.size()==0) {
	  
	  return Integer.MIN_VALUE; }
	  
	  List<Integer> sortedList = new ArrayList<Integer>();
	  Collections.sort(sortedList);
	  
	  return sortedList.get(0);
	  
	  }
	  
	  public static int Integermax (List<Integer> list) {
		  if (list == null || list.size() == 0) {
	            return Integer.MIN_VALUE;
	        }
	 
	     
	        List<Integer> sortedlist = new ArrayList<>(list);
	 
	    
	        Collections.sort(sortedlist);
	 
	        return sortedlist.get(sortedlist.size() - 1);
	  
	  }
	 

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(20);
		

		System.out.println("Mix No "+ Integermin(list));
		System.out.println("Max no " + Integermax(list));
		}

	}


