package com.xworkz.springAutowierd.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springAutowierd.configuration.SpringConfiguration;
import com.xworkz.springAutowierd.things.HardwareShop;
import com.xworkz.springAutowierd.things.Mytype;
import com.xworkz.springAutowierd.things.Pencil;
import com.xworkz.springAutowierd.things.Rubber;
import com.xworkz.springAutowierd.things.Softwear;
import com.xworkz.springAutowierd.things.softwearEngineer;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext container =
		new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		
		HardwareShop refOfHardware = container.getBean(HardwareShop.class);
		System.out.println(refOfHardware);
		
		Softwear refOfSoftware = container.getBean(Softwear.class);
		System.out.println(refOfSoftware);
		
		softwearEngineer refOfEng= container.getBean(softwearEngineer.class);
		System.out.println(refOfEng);
		
		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil);
		
		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber);
		
		Mytype refOfMytype = container.getBean(Mytype.class);
		System.out.println(refOfMytype);
	}

}
