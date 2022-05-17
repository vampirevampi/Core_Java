package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller

public class UserController {
	@RequestMapping(value="show",method=RequestMethod.GET)
	public String message(ModelMap map) {
		map.put("UName","UserName: Hema");
		map.put("Password","Password: Hema@6594");
	    map.put("OTP","OTP: 234");
	    return "content";

	}

}
