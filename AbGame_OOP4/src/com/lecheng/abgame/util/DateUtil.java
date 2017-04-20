package com.lecheng.abgame.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 将文本转化成日期
	 * 	time :时间文本
	 * 	pattern： 转换格式
	 * */
	public static Date getstrToDate(String time,String pattern){
		Date date=null;
		SimpleDateFormat sf=new SimpleDateFormat(pattern);
		try {
			//将文本转化成日期
			date=sf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
		
	}
	/**
	 * 将日期中的年，月，日，时，分，秒，取出拼接成一个字符串
	 * time :时间文本
	 * pattern： 转换格式
	 * */
	public static String getDateToStr(String time,String pattern){
		Calendar c=Calendar.getInstance();
		c.setTime(getstrToDate(time, pattern));
		int y=c.get(Calendar.YEAR);
		int M=c.get(Calendar.MONTH)+1;
		int d=c.get(Calendar.DATE);
		int h=c.get(Calendar.HOUR_OF_DAY);
		int m=c.get(Calendar.MINUTE);
		int s=c.get(Calendar.SECOND);
		return y+"年"+M+"月"+d+"日"+h+":"+m+":"+s;
	}
	public static void main(String[] args) {
		String str=DateUtil.getDateToStr("2017-4-19 17:23:32", "yyyy-MM-dd HH:mm:ss");
		//System.out.println(str);
	}
}
