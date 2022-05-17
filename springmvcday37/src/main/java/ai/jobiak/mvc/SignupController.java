package ai.jobiak.mvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller  //to indicate it is request handler

public class SignupController {
	@Autowired
	SignupDAO signup;
	public SignupController(SignupDAO signup) {
		this.signup=signup;
	}

		
	@RequestMapping(value="signup",method=RequestMethod.POST)
	public String doSignup(User user,ModelMap map) {
		
		signup.insertRow(user.getFname(),user.getEmail(),user.getMobile());
		map.put("fname",user.getFname());
		map.put("mobile",user.getMobile());
		map.put("email",user.getEmail());
		return "user";
	}
	
	}