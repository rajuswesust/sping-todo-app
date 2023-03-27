package com.raju.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

//	private AuthenticationService authenticationService;
//	
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

	//private Logger logger = LoggerFactory.getLogger(getClass());
//	
//	@RequestMapping(value="/login", method=RequestMethod.GET)
//	public String goToLoginPage() {
//		return "login"; 
//	}
	
	
//	@RequestMapping(value="login", method=RequestMethod.POST)
//	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//		
//		if(!authenticationService.authenticate(name, password)) {
//			model.put("errorMsg", "Invalid login credentials");
//			return "login";
//		}
//		
//		model.put("name", name);
//		model.put("password", password);
//		return "welcome";
//	}
	

	
//	@RequestMapping("login")
//	public String goToLoginPage(@RequestParam String name, ModelMap model) {
//		logger.debug("Request parameter is {}", name);
//		model.put("nam", name);
//		return "login";
//	}
	
}
