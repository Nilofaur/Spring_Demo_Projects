package com.eclipse.web.demo.Model;

public class Payment {
	
	String paymentMethod;

	public Payment(String paymentMethod) {
		// TODO Auto-generated constructor stub
		this.paymentMethod=paymentMethod;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
    public String toString() {
        return "PaymentType{" +
               "PayType=" + paymentMethod +              
               '}';
    }
}
