package com.lecheng.abgame.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.lecheng.abgame.util.StringUtil;

/**
 * 控制台输入辅助类
 * */
public class InputHelper {
	/*
	 * 接受控制台输入的文本
	 */
	public static String getString() {
		// 实例化Scanner类
		Scanner sc = new Scanner(System.in);
		// 使用对象sc来调用Scanner类中的实例方法
		String str = sc.next();
		// 返回的是一个String类型的结果
		return str;
	}

	/*
	 * 接受控制台输入的数字
	 */
	public static int getInt() {
		int i;
		while (true) {
			// 实例化Scanner类
			Scanner sc = new Scanner(System.in);
			// 使用对象sc来调用Scanner类中的实例方法
			// int i=sc.nextInt();
			// 返回的是一个int类型结果
			try {
				i = sc.nextInt();
				break;
			} catch (InputMismatchException i1) {
				System.err.println("您输入的类型有误，请重新输入：");
			}
		}
		return i;
	}

	/**
	 * 控制台上的文本与指定的正则表达式进行匹配
	 * 
	 * */
	public static String getString(String regex, String message) {
		String str = "";
		boolean b = true;
		while (b) {
			// 实例化Scanner类
			Scanner sc = new Scanner(System.in);
			str = sc.next();
			boolean flag = StringUtil.match(str, regex);
			if (flag) {
				b = false;
			} else {
				System.err.println("您输入有误，" + message);
			}
		}
		// 返回一个String的类型的结果
		return str;
	}
}
