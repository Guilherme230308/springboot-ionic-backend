package com.udemy.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private Long timtimeStamp;

	public StandardError(Integer status, String msg, Long timtimeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timtimeStamp = timtimeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimtimeStamp() {
		return timtimeStamp;
	}

	public void setTimtimeStamp(Long timtimeStamp) {
		this.timtimeStamp = timtimeStamp;
	}

}
