package com.lecheng.abgame.ui;

import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.util.ValidationUtil;
	/**
	 * 玩家辅助类
	 * */
public class PlayerHelper {
	public static Player getPlayerData(){
		Player pla=new Player();
		System.out.println("请输入玩家ID：");
		pla.setId(InputHelper.getInt());
		System.out.println("请输入玩家用户名：");
		pla.setLoginname(InputHelper.getString(ValidationUtil.CHKLOGINNAME, "用户名必须包含字母，不能低于1位，不能高于16为，请重新输入："));
		System.out.println("请输入密码：");
		pla.setPassword(InputHelper.getString(ValidationUtil.CHKPASSWORD, "密码必须由字母和数字组成，不能低于6位，不能高于16位，请重新输入："));
		System.out.println("请输入玩家昵称：");
		pla.setNickname(InputHelper.getString());
		System.out.println("请输入玩家性别：");
		pla.setSex(InputHelper.getString(ValidationUtil.CHKSEX, "性别只能输入男或女，请重新输入："));
		System.out.println("请输入玩家年龄：");
		pla.setAge(Integer.parseInt(InputHelper.getString(ValidationUtil.CHKAGR,  "年龄不能小于10岁，不能超过99，请重新输入：")));
		return pla;
	}
	
}
