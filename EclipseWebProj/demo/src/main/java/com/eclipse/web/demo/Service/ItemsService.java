package com.eclipse.web.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eclipse.web.demo.Model.Items;

@Service
public class ItemsService {
	
	
	List<Items> ItemsList=new ArrayList<>();
	
		//contructor	
		public ItemsService(){
		ItemsList.add(new Items(1, "Phone"));
		ItemsList.add(new Items(2, "Laptop"));
		ItemsList.add(new Items(3, "Tv"));
	}
		
		public List<Items> getAllItems() {
			return ItemsList;
			
		}
	
	

}
