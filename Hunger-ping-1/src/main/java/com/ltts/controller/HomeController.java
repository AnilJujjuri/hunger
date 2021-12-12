package com.ltts.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ltts.entity.Restaurant;
import com.ltts.repository.AdminRepository;
import com.ltts.repository.RestaurantRepository;
import com.ltts.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	RestaurantRepository restaurantRepository;

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/feedback")
	public String feedback() {
		return "feedback";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	@RequestMapping("/regsuc")
	public String regsuc() {
		return "regsuc";
	}
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
	@RequestMapping("/adminProfile")
	public String adminProfile() {
		return "adminProfile";
	}
	@RequestMapping("/addRestaurant")
	public String addRestaurant() {
		return "addRestaurant";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/addrestaurant")
	public String addrestaurant() {
		return "addrestaurant";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping("/addToCart")
	public String addToCart() {
		return "addToCart";
	}
	@RequestMapping("/cart")
	public String cart() {
		return "Cart";
	}
	
	
	@RequestMapping(value = "insertrestaurant", method = RequestMethod.POST)
	public String insertrestaurant(HttpServletRequest session) {
		

		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantId(Integer.parseInt(session.getParameter("restaurantId")));
		restaurant.setRestaurantName(session.getParameter("restaurantName"));
		restaurant.setRestaurantLocation(session.getParameter("restaurantLocation"));
		restaurant.setRestaurantExistance(Integer.parseInt(session.getParameter("date")));
		
		restaurantRepository.save(restaurant);
		
		return "insertrestaurant";
	}
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String memberInsert(HttpServletRequest session) {
		
		
		System.out.println(session.getParameter("address"));
		System.out.println(session.getParameter("mobNo"));
		System.out.println(session.getParameter("mailId"));
		System.out.println(session.getParameter("Uname"));
		
		return "userProfile";
	}
	@RequestMapping(value = "tryToLogin", method = RequestMethod.POST)
	public String tryToLogin(HttpServletRequest session) {
		
		if(AdminRepository.findUser(session.getParameter("uName"), session.getParameter("pass"))) {
			return "adminProfile";
		}
		else {
			if(UserRepository.findUser(session.getParameter("uName"),session.getParameter("pass")))
			return "userProfile";
		}
		return "failure";
	}
	
	@RequestMapping(value = "index1", method = RequestMethod.POST)
	public String index1() {
		return "index";
	}
	
	
	
}