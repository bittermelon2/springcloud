package com.carol.springcloud.service.impl;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.carol.springcloud.dao.PaymentDao;
import com.carol.springcloud.entities.Payment;
import com.carol.springcloud.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	//Autowire is ok too
	@Resource
	private PaymentDao paymentDao;
	
	public int create(Payment payment) {
		System.out.println("**************create in PaymentServiceImpl");
		//paymentDao.create(payment);
		
		return 5;
	}
	
	public Payment getPaymentById(Long id) {
		System.out.println("**************getPaymentById in PaymentServiceImpl");
		
		Payment payment = new Payment();
		payment.setId(id);
		payment.setSerial("000"+id);
		
//		paymentDao.getPaymentById(id);
		
		return payment;
	}
}
