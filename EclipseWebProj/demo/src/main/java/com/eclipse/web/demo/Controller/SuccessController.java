package com.eclipse.web.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eclipse.web.demo.Model.Items;
import com.eclipse.web.demo.Model.Success;
import com.eclipse.web.demo.Service.ItemsService;
import com.eclipse.web.demo.Service.PaymentService;
import com.eclipse.web.demo.Service.SuccessService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SuccessController {
	
	PaymentService ps;
	ItemsService is;
	SuccessService ss;
	
	SuccessController(PaymentService ps,ItemsService is,SuccessService ss)
	{
	this.ps=ps;	
	this.is=is;
	this.ss=ss;
	}
	
	
	@GetMapping("/success")
	public String success(HttpSession session, Model model, Success success,Items it)
	{
		//order no	
		System.out.println("OrderNo=getter"+success.getOrderNo());//no
		System.out.println("OrderNo ssMethod="+ss.getOrderNoMethod());//works
		model.addAttribute("OrderNo"+success.getOrderNo());// ??
		
		//Payment Details
		System.out.println("payment="+ps.GetAllPayments());
		model.addAttribute("payment",ps.GetAllPayments());
		
		//Items List
		System.out.println("itemsList ="+is.getAllItems());
		model.addAttribute("items",is.getAllItems());
		
		//Searched Item
//		System.out.println("search ="+it.getSearch());
//		model.addAttribute("search",it.getSearch());
//		
		String search= (String) session.getAttribute("search");
		 model.addAttribute("search",search);
		 System.out.println("User entered on SuccessControllerclass: " + search);
		
		return "success";
	}
	
	

}
