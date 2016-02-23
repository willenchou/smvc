package com.test.controller;

import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import com.test.model.UserInfo;  
import com.test.service.IUserInfoService;  


@Controller  
@RequestMapping("/user") 
public class queryUserController {

	 @Resource  
	 private IUserInfoService userService;  
	  
	    @RequestMapping("/showUserInfo")  
	    public String toIndex(HttpServletRequest request, Model model) {  
	        long pos_int = Long.parseLong(request.getParameter("id"));  
	        UserInfo userinfo = this.userService.getUserInfoById(pos_int);  
	        model.addAttribute("userinfo", userinfo);  
	        return "showUserInfo"; 
	    }
}
