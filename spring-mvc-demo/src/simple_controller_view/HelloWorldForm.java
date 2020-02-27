package simple_controller_view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldForm {
	
	@RequestMapping("/form")
	public String showform()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processform")
	public String process()
	{
		return "display-page";
	}
	

}
