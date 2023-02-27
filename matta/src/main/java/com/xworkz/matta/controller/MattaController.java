package com.xworkz.matta.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.matta.dto.MattaDTO;
import com.xworkz.matta.service.MattaService;

@Controller
@RequestMapping("/")
public class MattaController {
	
	public MattaController() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}
	@Autowired
	private MattaService mattaService;
	
		
	
	@GetMapping("/mattaAction")
	public String onMatta(Model model) {
		System.out.println("Running onMatta get Method");
		return "matta";
	}
	@PostMapping("/mattaAction")
	public String onMatta(Model model, MattaDTO dto) {
		System.out.println("Running onMatta post Method");
		Set<ConstraintViolation<MattaDTO>> violations = this.mattaService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("No violation, Save Success");
			
			return "success";
		}
		else {
			model.addAttribute("error", violations);
			model.addAttribute("dto", dto);
			System.out.println("Violation Exists");
			return "matta";
		}
		
	}
	
	@GetMapping("/find")
	public String getFind(Model model,@RequestParam int id) {
		System.out.println("Running in find");
		MattaDTO hDto=this.mattaService.findbyId(id);
		if (hDto != null) {
			model.addAttribute("dto", hDto);
		} else {
			model.addAttribute("mesage", "Do not found ");
		}
		return "searchById";
	}
	}