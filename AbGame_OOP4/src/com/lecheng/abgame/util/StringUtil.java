package com.lecheng.abgame.util;

public class StringUtil {
	/**
	 * �ж��ַ����Ƿ�Ϊ��
	 * s��ʾ���������ַ���
	 * ����ַ�������ֵΪ�շ���true���෴����flase
	 * */
	public static boolean isNull(String s){
		if(s==null){
			return false;
		}
		return true;
	}
	/**
	 * �ж��ַ�����������ʽ�Ƿ�ƥ��ɹ�
	 * */
	public static boolean match(String s,String regex){
		if(isNull(s)){//isnull��S�����ص�true����ʾ�ַ���SΪ�գ��޷�ƥ��
			return s.matches(regex);
		}
		//�ж��ַ����Ƿ���������ʽƥ��ɹ����ɹ�true��ʧ��flase
		return false;
		
	}
}
