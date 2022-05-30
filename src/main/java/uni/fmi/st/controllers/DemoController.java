package uni.fmi.st.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String getMessage() {
		return "Welcome to the demo Spring Boot project with submodules!";
	}
}
