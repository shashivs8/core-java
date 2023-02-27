package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.valentine.dto.CountryDTO;
import com.xworkz.valentine.service.CountryService;

@Controller
@RequestMapping("/airAction")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	public CountryController() {
		System.out.println("Running " + this.getClass().getSimpleName());
	}
	
	private List<String> type=Arrays.asList("JET","CargoAiroplane","MailtryPlan","DronePlane","SignalJamerPlan");
	private List<String> country=Arrays.asList("USA","RUSSIA","FINLAND","SRILANKA","GERMANY","CANADA");
	
	@GetMapping("/airAction")
	public String onAiroplane(Model model) {
		System.out.println("Running on valintine get method..");
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		return "airoplane";
		
	}
	
	@PostMapping("/airAction")
	public String onAiroplane(CountryDTO dto,   Model model) {
	
		System.out.println("running on valintine post method"+dto);
		
		Set<ConstraintViolation<CountryDTO>> violations=countryService.validateAndSave(dto);
		
		if(violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			
			return "success";
			
		}else {
			model.addAttribute("type",type);
			model.addAttribute("country",country);
			model.addAttribute("erros",violations);
			model.addAttribute("CountryDTO", dto);
			System.err.println("violation is controller");
			return "airoplane";
		}
		
		
	}
	
	@GetMapping("/searchAction")
	public String getSearch(@RequestParam int id, Model model) {
		System.out.println("Running in get Search");
		CountryDTO vDto=this.countryService.findBy(id);
		if(vDto!=null) {
			model.addAttribute("dto",vDto);
			
		}else {
			model.addAttribute("message","do not found");
		}
		return "feachById";
	}
}

