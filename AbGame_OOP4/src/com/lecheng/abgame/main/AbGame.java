package com.lecheng.abgame.main;

import java.util.ArrayList;
import java.util.List;

import com.lecheng.abgame.bean.Player;
import com.lecheng.abgame.ui.Menu;

public class AbGame {
	// ����player���͵����飬�����洢�����Ϣ
	//Player[] players = new Player[10];
	List<Player> players=new ArrayList<Player>();
	AdminManager am = new AdminManager(players);
	PlayerManager pm = new PlayerManager(players);

	// ��ʼ
	public void start() {
		boolean b = true;
		while (b) {
			int i = Menu.getMainUI();
			switch (i) {
			case 1:
				// ��ҵ�¼
				pm.playerOP();
				break;
			case 2:
				// ����Ա��¼
				// ����Ա���ε�¼
				for (int a = 1; a <= 3; a++) {
					boolean flag = am.chkLogin();
					if (flag) {
						// ��¼�ɹ�
						am.adminOP();
						// ��¼�ɹ��Ժ�Ҫ�����ǰ��forѭ��
						break;
					} else {
						// ��¼ʧ�ܣ�������¼
						if ((3 - a) > 0) {
							System.out.println("��������û���������������������" + (3 - a)
									+ "�λ��ᣬ���������룡����������");
						} else {
							System.out.println("���λ��������꣬ϵͳ�Զ��˳��С���������������������");
							b = false;
						}
					}
				}
				break;
			case 0:
				// �˳�
				System.out.println("ϵͳ�Զ��˳���........");
				b = false;
				break;
			default:
				System.out.println("�������������������룡������������");
				break;
			}
		}
	}

	public static void main(String[] args) {
		AbGame ab = new AbGame();
		ab.start();
	}
}
