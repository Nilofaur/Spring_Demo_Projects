package com.eclipse.web.demo.Service;

import org.springframework.stereotype.Service;

import com.eclipse.web.demo.Model.Success;

@Service
public class SuccessService {
	
	int OrderNo;
	
	SuccessService()
	{
		OrderNo=70892;
	}

	public int getOrderNoMethod()
	{
		return OrderNo;
		
	}
	
}
