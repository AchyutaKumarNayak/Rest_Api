package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/welcome")
	public String getWelcomeMsg(){
		return "Welcome to Ashokit..!!!";
	}
	@GetMapping("/greet")
	public String getGreetMsg() {
		String resPaylod="Good Morning..!!!";
		return resPaylod;
	} 

}
