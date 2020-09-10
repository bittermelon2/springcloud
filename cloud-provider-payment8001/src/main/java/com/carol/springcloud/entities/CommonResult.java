package com.carol.springcloud.entities;

public class CommonResult<T> {
	//404 not_found
	private Integer code;
	private String messgae;
	private T  data;
	
	public CommonResult() {}
	
	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
	
	public CommonResult(Integer code, String messgae, T data) {
		super();
		this.code = code;
		this.messgae = messgae;
		this.data = data;
	}


	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessgae() {
		return messgae;
	}
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	
	
}
