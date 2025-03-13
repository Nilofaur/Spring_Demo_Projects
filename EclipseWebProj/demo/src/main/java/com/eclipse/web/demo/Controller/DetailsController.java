package com.eclipse.web.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eclipse.web.demo.Model.Details;
import com.eclipse.web.demo.Model.Items;
import com.eclipse.web.demo.Service.DetailsService;
import com.eclipse.web.demo.Service.ItemsService;

import jakarta.servlet.http.HttpSession;

@RestController  // Change from @Controller to @RestController
@RequestMapping("/details")
public class DetailsController {
	
	private final ItemsService itemsService;
	
	// Inject ItemsService via Constructor
    public DetailsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

	@PostMapping(consumes = "application/x-www-form-urlencoded")
	public ResponseEntity<Map<String, Object>> getDetails(@RequestParam String search) {
		
	    Map<String, Object> response = new HashMap<>();
	    
	    response.put("enteredItem", search);
	    response.put("amount", 922.5);
	    
	 // Use itemsService to get the list instead of hardcoding
        response.put("availableItems", itemsService.getAllItems());

	    return ResponseEntity.ok(response); // Returns JSON response
	}
}
//package com.eclipse.web.demo.Controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.eclipse.web.demo.Model.Details;
//import com.eclipse.web.demo.Model.Items;
//import com.eclipse.web.demo.Service.DetailsService;
//import com.eclipse.web.demo.Service.ItemsService;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//public class DetailsController {
//	
//	private DetailsService dsObj;
//	private ItemsService isObj;
//	
//	//injecting two class objects
//	DetailsController(DetailsService dsObj, ItemsService isObj)
//	{
//		this.dsObj=dsObj;
//		this.isObj=isObj;
//	}
//	
//	@PostMapping("/details")
//	public String searchMethod(@ModelAttribute Items items, Model model, HttpSession session)
//	{
//		session.setAttribute("search", items.getSearch());
//		   // Log the search value for debugging
//	    System.out.println("User entered (detailscontroller class): " + items.getSearch());
//		
//		//fetching all the items -product details and adding it to the model
//		model.addAttribute("items", isObj.getAllItems());
//		
//		//Add user submitted form details - (search text box)		
//		
//		model.addAttribute("search", items.getSearch());
//		
//		//Also the GBP amount to the model
//		model.addAttribute("amount",dsObj.displayAmt());
//		
//		
//		return "details";
//		
//	}
//	
//	
//
//}
