package com.shopify.platform.features.security;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticate(HttpServletRequest request) {
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		boolean isLogin = StringUtils.hasText(Username) && StringUtils.hasText(Password);
		if (isLogin) {
			return "dashboard";
		} else {
			return "home";
		}
	}

}
