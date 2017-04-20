package com.lecheng.abgame.util;

public class StringUtil {
	/**
	 * 判断字符串是否为空
	 * s表示传进来的字符串
	 * 如果字符串返回值为空返回true，相反返回flase
	 * */
	public static boolean isNull(String s){
		if(s==null){
			return false;
		}
		return true;
	}
	/**
	 * 判断字符串与正则表达式是否匹配成功
	 * */
	public static boolean match(String s,String regex){
		if(isNull(s)){//isnull（S）返回的true，表示字符串S为空，无法匹配
			return s.matches(regex);
		}
		//判断字符串是否与正则表达式匹配成功，成功true，失败flase
		return false;
		
	}
}
