package com.lecheng.abgame.util;

public class ValidationUtil {
	//������ʽ��^��ͷ����$��β
	//(?![0-9]+$)���ַ�������֮ǰ����ֻ������
	//{m,n}�������ַ����ĳ��ȣ�����mλ�����nλ
	//�û���   �û������������ĸ
	public static final String CHKLOGINNAME="^(?![0-9]+$)[a-zA-Z0-9]{1,16}$";
	//����   ���������ֺ���ĸ��ɣ���������6λ�����ܴ���16λ
	public static final String CHKPASSWORD="^(?![0-9]+$)(?![a-zA-Z]+$)[a-zA-Z0-9]{6,16}$";
	//�Ա�ֻ���л�Ů
	public static final String CHKSEX="^['��','Ů']$";
	//����
	public static final String CHKAGR="^[1-9][0-9]$";
}
