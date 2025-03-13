package com.eclipse.web.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class Items {
	
	int id;
	String prName;
	String search;
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	//Constructor
	public Items(int id, String prName) {
		this.id=id;
		this.prName=prName;
		
	}
	
	//Constructor
		public Items(String search) {
			this.search=search;					
		}
		
	public Items() {
			// TODO Auto-generated constructor stub
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	
	 // Overridden toString() Method
    @Override
    public String toString() {
        return "Product{" +
               "id=" + id +
               ", prName='" + prName + '\'' +
              
               '}';
    }

}
