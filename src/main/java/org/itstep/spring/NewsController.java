package org.itstep.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
	
	@RequestMapping(value = "news", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("message", "hello contact say" );
		model.addAttribute("style", "resources/css/news.css");
		model.addAttribute("script", "resources/js/news.js");
		
		return "news/news";
	}

}