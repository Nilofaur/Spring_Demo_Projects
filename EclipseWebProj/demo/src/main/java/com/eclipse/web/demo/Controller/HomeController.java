package com.eclipse.web.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eclipse.web.demo.Model.Details;
import com.eclipse.web.demo.Model.Items;
import com.eclipse.web.demo.Service.ItemsService;

@Controller
public class HomeController {
	
	
	private final ItemsService itemsService;
	
	//injecting the bean via constructor with the values phone/lap/tv
	@Autowired // Make sure Spring can inject the dependency
	HomeController(ItemsService itemsService){
		this.itemsService=itemsService;
	}
	
	 @GetMapping("/")
	 public String home(Model model)
	 {
	//	 model.addAttribute("Items", itemsService.getAllItems());	
//		 model.addAttribute("search", new Items());
		 List<Items> items = itemsService.getAllItems();
		 model.addAttribute("items", items);
		 
		 return "index";
		 
	 }
	
	 
	
	

}
