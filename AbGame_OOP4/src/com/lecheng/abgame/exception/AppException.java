package com.lecheng.abgame.exception;

public class AppException extends Exception {
	//�����Զ����쳣��
	private String errmsg;//�쳣��Ϣ
	private int errcode;//�쳣����
	//���캯��
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
