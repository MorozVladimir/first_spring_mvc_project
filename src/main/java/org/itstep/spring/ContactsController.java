package org.itstep.spring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactsController {
	
	@RequestMapping(value = "contacts", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("message", "hello contact say" );
		
		return "contacts/contacts";
	}

}
