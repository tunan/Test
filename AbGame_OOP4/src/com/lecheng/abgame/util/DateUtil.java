package com.lecheng.abgame.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * ���ı�ת��������
	 * 	time :ʱ���ı�
	 * 	pattern�� ת����ʽ
	 * */
	public static Date getstrToDate(String time,String pattern){
		Date date=null;
		SimpleDateFormat sf=new SimpleDateFormat(pattern);
		try {
			//���ı�ת��������
			date=sf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
		
	}
	/**
	 * �������е��꣬�£��գ�ʱ���֣��룬ȡ��ƴ�ӳ�һ���ַ���
	 * time :ʱ���ı�
	 * pattern�� ת����ʽ
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
		return y+"��"+M+"��"+d+"��"+h+":"+m+":"+s;
	}
	public static void main(String[] args) {
		String str=DateUtil.getDateToStr("2017-4-19 17:23:32", "yyyy-MM-dd HH:mm:ss");
		//System.out.println(str);
	}
}
