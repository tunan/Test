package com.lecheng.abgame.main;

import java.util.List;

import com.lecheng.abgame.bean.Login;
import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.exception.AppException;
import com.lecheng.abgame.ui.InputHelper;
import com.lecheng.abgame.ui.Menu;
import com.lecheng.abgame.ui.PlayerHelper;

public class AdminManager {
	/**
	 * 检测是否登录成功
	 * */
	//Player[] players = null;
	List<Player> players = null;
	// 数组的起始下标
	int j = 0;

	/*
	 * AdminManager类的有参构造函数
	 */
	public AdminManager(List<Player> players) {
		this.players = players;
	}

	public boolean chkLogin() {
		boolean flag = false;
		// 调用登录界面
		Login login = Menu.getLoginUI();
		// 定义为admin
		if (login.getLoginname().equals("admin")
				&& login.getPassword().equals("admin")) {
			flag = true;
		}
		return flag;
	}

	/**
	 * 管理员操作方法
	 * */
	public void adminOP() {
		int i = Menu.getAdminUI();
		switch (i) {
		case 1:
			// 新增玩家
			boolean a = true;
			while (a) {
				// 新怎玩家界面，以及从控制台上输入的玩家信息封装到pla对象中，并返回
				Player player = PlayerHelper.getPlayerData();
				// 调用新增玩家的方法
				try {
					addPlayer(player);
				} catch (AppException e) {
					System.err.println("异常编码：" + e.getErrcode() + "!"
							+ e.getErrmsg());
				}
				// 数组下标下移
				//j++;
				System.out.println("是否继续添加      Y:是      N:否");
				if (InputHelper.getString().equalsIgnoreCase("N")) {// 判断键盘输入的是否为N
					a = false;
				}
			}
			break;
		case 2:
			// 修改玩家
			System.out.println("1");
			break;
		case 3:
			// 删除玩家
			System.out.println("1");
			break;
		case 4:
			// 查询玩家
			queryPlayers();
			break;
		case 5:
			// 查询游戏
			System.out.println("1");
			break;
		case 6:
			// 分数统计
			System.out.println("1");
			break;
		case 7:
			// 参数设置
			System.out.println("1");
			break;
		case 0:
			// 返回上级
			System.out.println("1");
			break;

		default:
			System.out.println("您输入有误，请重新选择：");
			break;
		}
	}

	/**
	 * 新增玩家的方法
	 * 
	 * */
	public void addPlayer(Player player) throws AppException {
		// 将玩家对象存到数组中
		// 判断用户名是否注册，如果注册了就不能注册，抛出异常
		for (Player pla : players) {
			if (pla != null) {
				if (pla.getLoginname().equals(player.getLoginname())
						|| pla.getId() == player.getId()) {
					throw new AppException("该用户信息已存在，请重新注册!!!", 200);
				}
			}
		}
		// 将传进来玩家存入数组
		//players[j] = player;
		players.add(player);
	}

	/**
	 * 查询玩家方法
	 * */
	public void queryPlayers() {
		System.out.println("玩家ID\t玩家用户名\t玩家昵称\t玩家性别\t玩家年龄");
		// 遍历数组
		for (Player player : players) {
			// 判空
			if (player != null) {
				System.out.println(player.getId() + "\t"
						+ player.getLoginname() + "\t" + player.getNickname()
						+ "\t" + player.getSex() + "\t" + player.getAge());
			}
		}
	}
}
