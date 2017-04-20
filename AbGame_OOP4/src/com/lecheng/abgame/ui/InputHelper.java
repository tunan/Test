package com.lecheng.abgame.ui;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.lecheng.abgame.util.StringUtil;

/**
 * ����̨���븨����
 * */
public class InputHelper {
	/*
	 * ���ܿ���̨������ı�
	 */
	public static String getString() {
		// ʵ����Scanner��
		Scanner sc = new Scanner(System.in);
		// ʹ�ö���sc������Scanner���е�ʵ������
		String str = sc.next();
		// ���ص���һ��String���͵Ľ��
		return str;
	}

	/*
	 * ���ܿ���̨���������
	 */
	public static int getInt() {
		int i;
		while (true) {
			// ʵ����Scanner��
			Scanner sc = new Scanner(System.in);
			// ʹ�ö���sc������Scanner���е�ʵ������
			// int i=sc.nextInt();
			// ���ص���һ��int���ͽ��
			try {
				i = sc.nextInt();
				break;
			} catch (InputMismatchException i1) {
				System.err.println("������������������������룺");
			}
		}
		return i;
	}

	/**
	 * ����̨�ϵ��ı���ָ����������ʽ����ƥ��
	 * 
	 * */
	public static String getString(String regex, String message) {
		String str = "";
		boolean b = true;
		while (b) {
			// ʵ����Scanner��
			Scanner sc = new Scanner(System.in);
			str = sc.next();
			boolean flag = StringUtil.match(str, regex);
			if (flag) {
				b = false;
			} else {
				System.err.println("����������" + message);
			}
		}
		// ����һ��String�����͵Ľ��
		return str;
	}
}
