package com.eclipse.web.demo.Model;

public class Details {
	double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//Constructor
		public Details(double price) {
			this.price=price;
		}
	

	public Details() {
			// TODO Auto-generated constructor stub
		}
	@Override
    public String toString() {
        return "Amount{" +               
               ", price=" + price +
               '}';
    }

}

//Display page needs to display all the items and 
//user searched item from index page