package com.eclipse.web.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipse.web.demo.Model.Details;
import com.eclipse.web.demo.Model.Items;

@Service
public class DetailsService {
	
	Double price;
	//contructor	
	public DetailsService(){
	price=900.5;
	
}
	
	
//	
//	//it adds a Users object (submitted form data) to the list
//    public void saveUsers(Users users) {
//        userApplication.add(users);
//    }
	
//	public String search(Items item)
//	{
//		return search;
//		
//	}
	
//	public Items displayItems(Items items)
//	{
//		return items;
//		
//	}
	
	public Double displayAmt()
	{
		return price;
		
	}

}
