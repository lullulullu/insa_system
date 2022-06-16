package com.spring.boot.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.service.InsaSystemService;

@Controller 
public class InsaSystemController {

	//파라미터 빈 프로퍼티 setter 메소드에 사용. 
	@Resource
	private InsaSystemService insasystemService;
	
	@RequestMapping(value = "/")
	public String index() throws Exception{		
		
		System.out.println("Index 페이지 넘어왔징");
		
		return "index";
	}
	
	@RequestMapping(value = "/input.do", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView write() throws Exception{
		
		 ModelAndView mav = new ModelAndView(); 
		 
		 mav.setViewName("insa/write");
		 
		 System.out.println("write 넘어왔다");
		
		 return mav;
	}
	
}
