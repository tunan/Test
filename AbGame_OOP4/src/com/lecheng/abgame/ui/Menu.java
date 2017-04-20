package com.lecheng.abgame.ui;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.game.Bird;
import com.lecheng.abgame.game.DataInit;

public class Menu {
	/**
	 * ��ҳ��˵�
	 * */
	public static int getMainUI(){
		System.out.println("**************************************");
		System.out.println();
		System.out.println("\t��     ŭ    ��    С    ��");
		System.out.println("��ѡ���¼��ʽ��");
		System.out.println();
		System.out.println("1����ҵ�¼  2������Ա��¼   0���˳�");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("��ѡ��");
		//int i=InputHelper.getInt();
		//������̨��������ַ���
		return InputHelper.getInt();
	}
	/**
	 * ��½����
	 * */
	public static Login getLoginUI(){
		Login login=new Login();
		System.out.println("�������û�����");
		//���տ���̨������ı�
		String loginname=InputHelper.getString();
		//��loginname���Ը�ֵ
		login.setLoginname(loginname);
		System.out.println("���������룺");
		//������̨��������ı���ֵ��password
		login.setPassword(InputHelper.getString());
		return login;
	} 
	/**
	 * ����Ա��������
	 * */
	public static int getAdminUI(){
		System.out.println("*******************************");
		System.out.println();
		System.out.println("\t\tϵͳ����");
		System.out.println();
		System.out.println("\t 1���������");
		System.out.println();
		System.out.println("\t 2���޸����");
		System.out.println();
		System.out.println("\t 3��ɾ�����");
		System.out.println();
		System.out.println("\t 4����ѯ���");
		System.out.println();
		System.out.println("\t 5����ѯ��Ϸ");
		System.out.println();
		System.out.println("\t 6������ͳ��");
		System.out.println();
		System.out.println("\t 7����������");
		System.out.println();
		System.out.println("\t 0����        ��");
		System.out.println();
		System.out.println("*******************************");
		System.out.println("��ѡ��");
		return InputHelper.getInt();
	}
	/**
	 * ��Ҳ�������
	 * */
	public static int getPlayerUI(){
		System.out.println("*************************************");
		System.out.println();
		System.out.println("\t��     ŭ    ��    С    ��");
		System.out.println();
		System.out.println("\t 1���� ʼ �� Ϸ");
		System.out.println();
		System.out.println("\t 2���� �� �� ��");
		System.out.println();
		System.out.println("\t 0���� ��  �� ��");
		System.out.println();
		System.out.println("*************************************");
		System.out.println("��ѡ��");
		return InputHelper.getInt();
	}
	/**
	 * ѡ��С��˵�
	 * 
	 * */
	public static void chooseBirdUI(){
		System.out.println("************************************");
		System.out.println("\t\t��ѡ��С��");
		//�����洢С�����ݵ�����
		for(Bird b:DataInit.birdtypes){
			System.out.println(b.getId()+"��"+b.getName()+"\t��������"+b.getAttackValue()+"\t������:"+b.getHitValue()+"%");
		}
		System.out.println("0�������ϼ�");
		System.out.println("��ѡ�񣺣�ѡ��5��С���𹥻���������ͬ���Բ�ͬ��");
		System.out.println("************************************");
	}
}
