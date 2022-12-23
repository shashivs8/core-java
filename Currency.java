package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;

public class Currency {
		public static void main(String[] args) {
			
			Collection collection = new ArrayList<String>();
			collection.add("Rupees");
			collection.add("Dollor");
			collection.add("Euro");				
			collection.add("Pound");
			collection.add("Astralian doller");
			collection.add("Canadian Doller");
			collection.add("France");
			collection.add("South African Rand");
			collection.add("Japanese Yen");
			collection.add("Albanian Lek");
			collection.add("Russian Ruble");
			collection.add( "Israeli Shekel");
			collection.add("New Zealand Dollar");
			collection.add("Chinese Yuan");
			collection.add("Danish Krone");
			collection.add("Swedish Krona");
			collection.add("Brazilian Real");
			collection.add("Turkish lira");
			collection.add("Philippine peso");
			collection.add("Polish Zloty");
			collection.add("Mexican Peso");
			collection.add("Hong Kong Dollar");
			collection.add("Malaysian Ringgit");
			collection.add("Bulgarian Lev");
			collection.add("South Korean won");
			collection.add("Indonesian Rupiah");

			
			System.out.println(collection.size());
			collection.clear();
			System.out.println(collection.size());
			


		}
}
