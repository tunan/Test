package com.lecheng.abgame.main;

import java.util.ArrayList;
import java.util.List;

import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;

public class AbGame {
	// 创建player类型的数组，用来存储玩家信息
	//Player[] players = new Player[10];
	List<Player> players=new ArrayList<Player>();
	AdminManager am = new AdminManager(players);
	PlayerManager pm = new PlayerManager(players);

	// 开始
	public void start() {
		boolean b = true;
		while (b) {
			int i = Menu.getMainUI();
			switch (i) {
			case 1:
				// 玩家登录
				pm.playerOP();
				break;
			case 2:
				// 管理员登录
				// 管理员三次登录
				for (int a = 1; a <= 3; a++) {
					boolean flag = am.chkLogin();
					if (flag) {
						// 登录成功
						am.adminOP();
						// 登录成功以后，要填出当前的for循环
						break;
					} else {
						// 登录失败，继续登录
						if ((3 - a) > 0) {
							System.out.println("您输入的用户名或者密码有误，您还有" + (3 - a)
									+ "次机会，请重新输入！！！！！！");
						} else {
							System.out.println("三次机会已用完，系统自动退出中。。。。。。。。。。。");
							b = false;
						}
					}
				}
				break;
			case 0:
				// 退出
				System.out.println("系统自动退出中........");
				b = false;
				break;
			default:
				System.out.println("您输入有误，请重新输入！！！！！！！");
				break;
			}
		}
	}

	public static void main(String[] args) {
		AbGame ab = new AbGame();
		ab.start();
	}
}
