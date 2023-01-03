package com.xworkx.collectionApp;

import java.util.ArrayList;
import java.util.Collection;

public class Application {
	
	public static void main(String[] args) {
		
		Collection<ApplicationDTO> appDto = new ArrayList<ApplicationDTO>();
		
		appDto.add(new ApplicationDTO("Instagram", 1.5, true, "Meta"));
		appDto.add(new ApplicationDTO("Whatsapp", 1.6, true, "Meta"));
		appDto.add(new ApplicationDTO("Tinder", 5.8, false, "tind"));
		appDto.add(new ApplicationDTO("Linkdin", 5.9, true, "link"));
		appDto.add(new ApplicationDTO("Map", 5.1, false, "Google"));

		appDto.stream().filter((e)->e.isFree==true)
		.forEach((e)->System.out.println(e));
		appDto.stream().filter((e)->e.developedBy.equals("Google"))
		.forEach((e)->System.out.println(e));
		appDto.stream().filter((e)->e.getVirsion()>=5).forEach((e)->System.out.println(e.getName()));
			
	}

}
