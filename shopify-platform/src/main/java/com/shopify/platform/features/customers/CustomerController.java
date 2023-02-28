package com.shopify.platform.features.customers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("/view-customerBoard")
	public String Viewcustomer()
	{
		return "customer-dashboard";
	}
	
	@RequestMapping("/add-customer-view")
	public String addcustomerview()
	{
		return "add-customer";
	}

}
