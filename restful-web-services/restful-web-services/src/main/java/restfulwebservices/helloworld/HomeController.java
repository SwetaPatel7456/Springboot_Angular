package restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HomeController {
	
	@GetMapping(path = "/hello")
	public String HelloWorldController() {
		return "Hello-World";
	}
	@GetMapping("/hello-world-bean/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		
	 		return new HelloWorldBean( name);
	 	}
	
	@GetMapping("/sweta-bean")
	public HelloWorldBean helloWorldPathVariable1() {
		throw new RuntimeException("Some error has occured!Contact Support at ****");
		//return new HelloWorldBean("Hello-World-Bean-Changed");
	}

}
