package com.xworkx.collectionApp;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SoftWareCompanies {
	public static void main(String[] args) {
		
	
	String company1="Infosys";
	String company2="Tech Mahindra";
	String company3="Wipro";
	String company4="TCS";
	String company5="IBM";
	String company6="Gligar";
	String company7="Technovert";
	String company8="ToryHaries";
	String company9="Diloit";
	String company10="Capgemini";
	String company11="Google";
	String company12="Apple";
	String company13="Flipkart";
	String company14="Amazon";
	String company16="Cisco";
	String company17="Adobe";
	String company18="Accenture";
	String company19="Oracle";
	String company20="Cognizent";
	
	Collection<String> companies = new LinkedList<String>();
	companies.add(company20);
	companies.add(company19);
	companies.add(company18);
	companies.add(company17);
	companies.add(company16);
	companies.add(company12);
	companies.add(company14);
	companies.add(company13);
	companies.add(company11);
	companies.add(company10);
	companies.add(company9);
	companies.add(company8);
	companies.add(company7);
	companies.add(company6);
	companies.add(company5);
	companies.add(company4);
	companies.add(company3);
	companies.add(company2);
	companies.add(company1);

	for(String names:companies) {
		System.out.println(names);
	}
	System.out.println("  ");
	System.out.println("===After Iterator===");
	System.out.println("  ");
	Iterator<String> elements = companies.iterator();
	
	while(elements.hasNext()) {
		System.out.println(elements.next());
	}

	


	}

}
