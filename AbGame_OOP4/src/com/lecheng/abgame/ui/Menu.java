package com.lecheng.abgame.ui;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.game.Bird;
import com.lecheng.abgame.game.DataInit;

public class Menu {
	/**
	 * 主页面菜单
	 * */
	public static int getMainUI(){
		System.out.println("**************************************");
		System.out.println();
		System.out.println("\t愤     怒    的    小    鸟");
		System.out.println("请选择登录方式：");
		System.out.println();
		System.out.println("1、玩家登录  2、管理员登录   0、退出");
		System.out.println();
		System.out.println("**************************************");
		System.out.println("请选择：");
		//int i=InputHelper.getInt();
		//将控制台输入的数字返回
		return InputHelper.getInt();
	}
	/**
	 * 登陆界面
	 * */
	public static Login getLoginUI(){
		Login login=new Login();
		System.out.println("请输入用户名：");
		//接收控制台输入的文本
		String loginname=InputHelper.getString();
		//给loginname属性赋值
		login.setLoginname(loginname);
		System.out.println("请输入密码：");
		//将控制台上输入的文本赋值给password
		login.setPassword(InputHelper.getString());
		return login;
	} 
	/**
	 * 管理员操作界面
	 * */
	public static int getAdminUI(){
		System.out.println("*******************************");
		System.out.println();
		System.out.println("\t\t系统管理");
		System.out.println();
		System.out.println("\t 1、新增玩家");
		System.out.println();
		System.out.println("\t 2、修改玩家");
		System.out.println();
		System.out.println("\t 3、删除玩家");
		System.out.println();
		System.out.println("\t 4、查询玩家");
		System.out.println();
		System.out.println("\t 5、查询游戏");
		System.out.println();
		System.out.println("\t 6、分数统计");
		System.out.println();
		System.out.println("\t 7、参数设置");
		System.out.println();
		System.out.println("\t 0、返        回");
		System.out.println();
		System.out.println("*******************************");
		System.out.println("请选择：");
		return InputHelper.getInt();
	}
	/**
	 * 玩家操作界面
	 * */
	public static int getPlayerUI(){
		System.out.println("*************************************");
		System.out.println();
		System.out.println("\t愤     怒    的    小    鸟");
		System.out.println();
		System.out.println("\t 1、开 始 游 戏");
		System.out.println();
		System.out.println("\t 2、查 看 成 绩");
		System.out.println();
		System.out.println("\t 0、返 回  上 级");
		System.out.println();
		System.out.println("*************************************");
		System.out.println("请选择：");
		return InputHelper.getInt();
	}
	/**
	 * 选择小鸟菜单
	 * 
	 * */
	public static void chooseBirdUI(){
		System.out.println("************************************");
		System.out.println("\t\t请选择小鸟");
		//遍历存储小鸟数据的数组
		for(Bird b:DataInit.birdtypes){
			System.out.println(b.getId()+"、"+b.getName()+"\t攻击力："+b.getAttackValue()+"\t命中率:"+b.getHitValue()+"%");
		}
		System.out.println("0、返回上级");
		System.out.println("请选择：（选择5个小鸟发起攻击，可以相同可以不同）");
		System.out.println("************************************");
	}
}
