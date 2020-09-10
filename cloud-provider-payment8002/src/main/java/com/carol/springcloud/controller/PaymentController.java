package com.carol.springcloud.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carol.springcloud.entities.CommonResult;
import com.carol.springcloud.entities.Payment;
import com.carol.springcloud.service.PaymentService;
import com.carol.springcloud.service.impl.PaymentServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController {
	@Resource
	private PaymentService paymentService;
	
	@Value("${server.port}")
	private String serverPort;
	
	@PostMapping(value="/payment/create")
	public CommonResult create(@RequestBody Payment payment) {//@RequestBody
		int result = paymentService.create(payment);
		System.out.println("*****insert result:"+result);
		
		if(result>0) {
			return new CommonResult(200, "insertion success", result);
		}else {
			return new CommonResult(444, "insertion failure", null);
		}
	}
	
	@GetMapping(value="/payment/get/{id}")
	public CommonResult getPaymentById( @PathVariable("id") Long id) {//@RequestBody
		System.out.println("*****getPaymentById id "+id);
		Payment payment = paymentService.getPaymentById(id);
		System.out.println("*****query result:"+payment);
		
		if(payment!=null) {
			return new CommonResult(200, "query success, serverPort: "+serverPort, payment);
		}else {
			return new CommonResult(444, "No record, query failure, id:"+id, null);
		}
//		return new CommonResult(444, "No record, query failure, id:"+id, null);
	}
}
