package org.itstep.spring;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EnterController {
	
private static final Logger logger = LoggerFactory.getLogger(EnterController.class);
	
	@RequestMapping(value = "/enter", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome enter! The client locale is {}.", locale);
		
		model.addAttribute("message", "hello entercontroller say" );
		
		return "enter/enter";
	}
}
