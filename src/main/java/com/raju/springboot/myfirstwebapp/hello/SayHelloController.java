package com.raju.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "hello..!How are you today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Not my first HT<L page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("not my first html body"); 
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
}
