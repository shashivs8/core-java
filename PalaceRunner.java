package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PalaceRunner {
	
	public static void main(String[] args) {
		 
		Collection<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Mysore", "Vadayas", false, 100d));
		palace.add(new PalaceDTO("Bangalore", "Kempegowda", false, 150d));
		palace.add(new PalaceDTO("Lalith", "Vadayas", true, 200d));
		palace.add(new PalaceDTO("Kamal", "Raja", true, 100d));

		palace.stream()
		.filter((p)->p.isDestroyed==false)
		.collect(Collectors.toList())
		.forEach((e)->System.out.println(e));
		
		
		
	}

}
