package com.shopify.platform.features.home;
//import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import lombok.extern.slf4j.Slf4j;

@Controller
//@Slf4j
public class HomeController {
	// private static Logger log= LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "", "/", "/home" })
	public String viewHomePage() {
		//Log.info("i am in Home Controller viewHomePage method");
		return "home";
	}

}
