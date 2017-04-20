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
	 * ����Ƿ��¼�ɹ�
	 * */
	//Player[] players = null;
	List<Player> players = null;
	// �������ʼ�±�
	int j = 0;

	/*
	 * AdminManager����вι��캯��
	 */
	public AdminManager(List<Player> players) {
		this.players = players;
	}

	public boolean chkLogin() {
		boolean flag = false;
		// ���õ�¼����
		Login login = Menu.getLoginUI();
		// ����Ϊadmin
		if (login.getLoginname().equals("admin")
				&& login.getPassword().equals("admin")) {
			flag = true;
		}
		return flag;
	}

	/**
	 * ����Ա��������
	 * */
	public void adminOP() {
		int i = Menu.getAdminUI();
		switch (i) {
		case 1:
			// �������
			boolean a = true;
			while (a) {
				// ������ҽ��棬�Լ��ӿ���̨������������Ϣ��װ��pla�����У�������
				Player player = PlayerHelper.getPlayerData();
				// ����������ҵķ���
				try {
					addPlayer(player);
				} catch (AppException e) {
					System.err.println("�쳣���룺" + e.getErrcode() + "!"
							+ e.getErrmsg());
				}
				// �����±�����
				//j++;
				System.out.println("�Ƿ�������      Y:��      N:��");
				if (InputHelper.getString().equalsIgnoreCase("N")) {// �жϼ���������Ƿ�ΪN
					a = false;
				}
			}
			break;
		case 2:
			// �޸����
			System.out.println("1");
			break;
		case 3:
			// ɾ�����
			System.out.println("1");
			break;
		case 4:
			// ��ѯ���
			queryPlayers();
			break;
		case 5:
			// ��ѯ��Ϸ
			System.out.println("1");
			break;
		case 6:
			// ����ͳ��
			System.out.println("1");
			break;
		case 7:
			// ��������
			System.out.println("1");
			break;
		case 0:
			// �����ϼ�
			System.out.println("1");
			break;

		default:
			System.out.println("����������������ѡ��");
			break;
		}
	}

	/**
	 * ������ҵķ���
	 * 
	 * */
	public void addPlayer(Player player) throws AppException {
		// ����Ҷ���浽������
		// �ж��û����Ƿ�ע�ᣬ���ע���˾Ͳ���ע�ᣬ�׳��쳣
		for (Player pla : players) {
			if (pla != null) {
				if (pla.getLoginname().equals(player.getLoginname())
						|| pla.getId() == player.getId()) {
					throw new AppException("���û���Ϣ�Ѵ��ڣ�������ע��!!!", 200);
				}
			}
		}
		// ����������Ҵ�������
		//players[j] = player;
		players.add(player);
	}

	/**
	 * ��ѯ��ҷ���
	 * */
	public void queryPlayers() {
		System.out.println("���ID\t����û���\t����ǳ�\t����Ա�\t�������");
		// ��������
		for (Player player : players) {
			// �п�
			if (player != null) {
				System.out.println(player.getId() + "\t"
						+ player.getLoginname() + "\t" + player.getNickname()
						+ "\t" + player.getSex() + "\t" + player.getAge());
			}
		}
	}
}
