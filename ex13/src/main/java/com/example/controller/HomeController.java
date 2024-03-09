package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.UserService;
import com.example.vo.UserVO;


@Controller
public class HomeController {
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String chat() {
		return "chat";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("pageName", "about.jsp");
		System.out.println("홈테스트");
		return "home";
	}
	
	@RequestMapping(value = "/login")
	public String login(Model model){
		model.addAttribute("pageName", "login.jsp");
		System.out.println("로그인테스트");
		return "home";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public int loginPost(String uuid, String upass, HttpSession session){
		int result=0;
		UserVO vo=userService.getUser(uuid);
		System.out.println(uuid);
		System.out.println(vo.getUid());
		System.out.println(vo.getUpass());
		if(vo!=null){
			if(vo.getUpass().equals(upass)){
				session.setAttribute("uuid", uuid);
//				session.setAttribute("photo", vo.getPhoto());
				result=1;
			}else{
				result=2;
			}
		}
		return result;
	}
}





