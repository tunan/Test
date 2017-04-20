package com.lecheng.abgame.util;

public class ValidationUtil {
	//正则表达式以^开头，以$结尾
	//(?![0-9]+$)在字符串结束之前不能只有数字
	//{m,n}限制了字符串的长度，最少m位，最多n位
	//用户名   用户名必须得有字母
	public static final String CHKLOGINNAME="^(?![0-9]+$)[a-zA-Z0-9]{1,16}$";
	//密码   必须有数字和字母组成，不能少于6位，不能大于16位
	public static final String CHKPASSWORD="^(?![0-9]+$)(?![a-zA-Z]+$)[a-zA-Z0-9]{6,16}$";
	//性别只有男或女
	public static final String CHKSEX="^['男','女']$";
	//年龄
	public static final String CHKAGR="^[1-9][0-9]$";
}
