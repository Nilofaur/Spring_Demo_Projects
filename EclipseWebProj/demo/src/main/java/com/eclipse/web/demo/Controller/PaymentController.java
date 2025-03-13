package com.eclipse.web.demo.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.eclipse.web.demo.Service.PaymentService;

import jakarta.servlet.http.HttpSession;

import com.eclipse.web.demo.Model.Details;
import com.eclipse.web.demo.Model.Items;

import com.eclipse.web.demo.Service.DetailsService;
import com.eclipse.web.demo.Service.ItemsService;
import org.springframework.ui.Model;


@Controller
public class PaymentController {
	
	PaymentService ps;
	ItemsService is;
	DetailsService ds;
	
	PaymentController(PaymentService ps, ItemsService is, DetailsService ds)
	{
		this.ps=ps;
		this.is=is;
		this.ds=ds;
		
	}
	
	 @GetMapping("/payment")
	 public String pay(HttpSession session, Model model,Items items,Details d)
	 {
		 //Payment types
		 model.addAttribute("PaymentTypes", ps.GetAllPayments());
		 
		 //item list
		 model.addAttribute("items", is.getAllItems());
		 
		 //Amt
		 model.addAttribute("amt",ds.displayAmt());	
		 System.out.println("amt ds.displayAmt()= " + ds.displayAmt());
		 System.out.println("amt d.getPrice() "+d.getPrice());
		 
		 //searched item
		 String search= (String) session.getAttribute("search");
		 model.addAttribute("search",search);
		 System.out.println("User entered on payControllerclass: " + search);
		 
		 return "payment";
	 }
	 
//	 @PostMapping ("/payment")
//	 public String pay(@ModelAttribute Details details ,Items item,Model model)
//	 {
//		 // Log the search value for debugging
//		 System.out.println("User entered:??== " + item.getSearch());
//		 model.addAttribute("PaymentTypes", ps.GetAllPayments());
//		 model.addAttribute("items", is.getAllItems());
//		 model.addAttribute("amt",details.getPrice() );
//		 model.addAttribute("search",800);		 
//		 return "payment";
//	 }

}
