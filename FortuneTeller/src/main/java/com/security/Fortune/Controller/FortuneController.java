package com.security.Fortune.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.Fortune.Entity.FortuneTable;
import com.security.Fortune.Service.FortuneServiceInterface;

@Controller
public class FortuneController {

	@Autowired
	private FortuneServiceInterface fortuneService;

	public FortuneController(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
	}

	@RequestMapping("/Fortune/{id}")
	public String getDailyFortune(Model theModel,@PathVariable int id) {

		Optional<FortuneTable> optional = fortuneService.getDailyFortuneById(id);
		
		if(optional.isPresent())
		{
		theModel.addAttribute("theId",id);
		theModel.addAttribute("theMsg",optional.get().getFortune());
		}
		else {
			theModel.addAttribute("theId",id);
			theModel.addAttribute("theMsg","You have entered an Invalid Fortune Number");	
		}
		return "home";

	}
}
