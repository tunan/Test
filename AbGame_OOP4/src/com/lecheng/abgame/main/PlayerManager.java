package com.lecheng.abgame.main;

import java.util.List;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.game.Bird;
import com.lecheng.abgame.game.BirdHelper;
import com.lecheng.abgame.game.PlayGame;
import com.lecheng.abgame.ui.InputHelper;
import com.lecheng.abgame.ui.Menu;

public class PlayerManager {
	PlayGame pg = new PlayGame();

	//Player[] players = null;
	 List<Player> players = null;

	/**
	 * PlayerManager类的有参构造函数
	 * */
	public PlayerManager(List<Player> players) {
		this.players = players;
	}

	/**
	 * 检测玩家是否登录成功
	 * */
	public Player chkLogin() {
		Player pla = null;
		Login login = Menu.getLoginUI();
		// 遍历数组
		for (Player player : players) {
			if (player != null) {
				if (login.getLoginname().equals(player.getLoginname())
						&& login.getPassword().equals(player.getPassword())) {
					pla = player;
				}
			}
		}
		return pla;
	}

	/**
	 * 玩家操作方法
	 * */
	public void playerOP() {
		Player pla = chkLogin();
		if (pla != null) {
			int i = Menu.getPlayerUI();
			switch (i) {
			case 1:
				boolean flag = true;
				while (flag) {
					// 开始游戏
					BirdHelper bh = new BirdHelper();
					//Bird[] birds = bh.getchooseBirds();
					List<Bird> birds = bh.getchooseBirds();
					if (birds == null || birds.size() <= 0) {
						// 返回上一级
						return;
					}
					pg.setBirds(birds);
					pg.setPlayer(pla);
					pg.play();
					System.out.println("是否继续游戏   Y:是    N：否");
					if (InputHelper.getString().equalsIgnoreCase("n")) {
						// 关闭开关 游戏停止
						flag = false;
					}
				}
				break;
			case 2:
				// 查询成绩
				break;
			case 0:
				// 返回上级
				break;

			default:
				System.out.println("您输入有误，请重新输入！！！！！！！！");
				break;
			}
		} else {
			System.out.println("您输入的用户名或密码有误，请重新输入！！！！！");
		}
	}
}
