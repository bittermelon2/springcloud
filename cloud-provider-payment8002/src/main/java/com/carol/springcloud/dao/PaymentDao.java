package com.carol.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.carol.springcloud.entities.Payment;

//if mybatis, It is better to use @Mapper,. @Repository will have issue when inserting for mybatis
@Mapper
public interface PaymentDao {
	public int create(Payment payment);
	
	public Payment getPaymentById(@Param("id") Long id);//
}
