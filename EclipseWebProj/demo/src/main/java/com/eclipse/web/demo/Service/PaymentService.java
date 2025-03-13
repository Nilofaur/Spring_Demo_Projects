package com.eclipse.web.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.eclipse.web.demo.Model.Payment;

@Service
public class PaymentService {

	PaymentService ps;
	List<Payment> PaymentTypeList =new ArrayList<>();
	
	PaymentService (){
		
	PaymentTypeList.add(new Payment("Credit"));
	PaymentTypeList.add(new Payment("Debit"));
	PaymentTypeList.add(new Payment("Paypal"));
	PaymentTypeList.add(new Payment("Pay By Cash"));
		
		
	}
	
	public List<Payment> GetAllPayments()
	{
		System.out.println("Payment Types: " + PaymentTypeList);
		return PaymentTypeList;
		
	}
	
}
