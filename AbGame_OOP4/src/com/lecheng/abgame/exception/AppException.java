package com.lecheng.abgame.exception;

public class AppException extends Exception {
	//程序自定义异常类
	private String errmsg;//异常信息
	private int errcode;//异常编码
	//构造函数
	public AppException(String errmsg,int errcode){
		this.errcode=errcode;
		this.errmsg=errmsg;
	}
	
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
}
