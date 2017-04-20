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
	 * PlayerManager����вι��캯��
	 * */
	public PlayerManager(List<Player> players) {
		this.players = players;
	}

	/**
	 * �������Ƿ��¼�ɹ�
	 * */
	public Player chkLogin() {
		Player pla = null;
		Login login = Menu.getLoginUI();
		// ��������
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
	 * ��Ҳ�������
	 * */
	public void playerOP() {
		Player pla = chkLogin();
		if (pla != null) {
			int i = Menu.getPlayerUI();
			switch (i) {
			case 1:
				boolean flag = true;
				while (flag) {
					// ��ʼ��Ϸ
					BirdHelper bh = new BirdHelper();
					//Bird[] birds = bh.getchooseBirds();
					List<Bird> birds = bh.getchooseBirds();
					if (birds == null || birds.size() <= 0) {
						// ������һ��
						return;
					}
					pg.setBirds(birds);
					pg.setPlayer(pla);
					pg.play();
					System.out.println("�Ƿ������Ϸ   Y:��    N����");
					if (InputHelper.getString().equalsIgnoreCase("n")) {
						// �رտ��� ��Ϸֹͣ
						flag = false;
					}
				}
				break;
			case 2:
				// ��ѯ�ɼ�
				break;
			case 0:
				// �����ϼ�
				break;

			default:
				System.out.println("�������������������룡��������������");
				break;
			}
		} else {
			System.out.println("��������û����������������������룡��������");
		}
	}
}
