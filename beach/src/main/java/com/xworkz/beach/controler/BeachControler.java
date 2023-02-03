package com.xworkz.beach.controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.beach.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class BeachControler {

	public BeachControler() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String inBeach(BeachDTO beachDTO, Model model) {
		System.out.println("Running on Beach " + beachDTO);
		model.addAttribute("name",beachDTO.getName());
		model.addAttribute("location", beachDTO.getLocation());
		return "beachSuccess.jsp";

	}

}
