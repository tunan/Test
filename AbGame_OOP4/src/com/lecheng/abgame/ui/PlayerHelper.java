package com.lecheng.abgame.ui;

import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.util.ValidationUtil;
	/**
	 * ��Ҹ�����
	 * */
public class PlayerHelper {
	public static Player getPlayerData(){
		Player pla=new Player();
		System.out.println("���������ID��");
		pla.setId(InputHelper.getInt());
		System.out.println("����������û�����");
		pla.setLoginname(InputHelper.getString(ValidationUtil.CHKLOGINNAME, "�û������������ĸ�����ܵ���1λ�����ܸ���16Ϊ�����������룺"));
		System.out.println("���������룺");
		pla.setPassword(InputHelper.getString(ValidationUtil.CHKPASSWORD, "�����������ĸ��������ɣ����ܵ���6λ�����ܸ���16λ�����������룺"));
		System.out.println("����������ǳƣ�");
		pla.setNickname(InputHelper.getString());
		System.out.println("����������Ա�");
		pla.setSex(InputHelper.getString(ValidationUtil.CHKSEX, "�Ա�ֻ�������л�Ů�����������룺"));
		System.out.println("������������䣺");
		pla.setAge(Integer.parseInt(InputHelper.getString(ValidationUtil.CHKAGR,  "���䲻��С��10�꣬���ܳ���99�����������룺")));
		return pla;
	}
	
}
