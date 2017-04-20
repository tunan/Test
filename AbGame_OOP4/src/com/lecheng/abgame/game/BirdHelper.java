package com.lecheng.abgame.game;

import java.util.ArrayList;
import java.util.List;
import com.lecheng.abgame.exception.AppException;
import com.lecheng.abgame.ui.InputHelper;
import com.lecheng.abgame.ui.Menu;

/**
 * ѡ��С������
 * */
public class BirdHelper {
	// �������飬�����洢ѡ�����ֻС��
	//static Bird[] birds = new Bird[5];
	List<Bird> birds = new ArrayList<Bird>();

	public  List<Bird> getchooseBirds() {
		// ��ʾѡ��С��˵�
		Menu.chooseBirdUI();
		for (int i = 0; i < 5; i++) {
			int a = InputHelper.getInt();
			if (a == 0) {
				return null;
			}
			// ���ݱ��ѡ��С��
			Bird bird;

			try {
				bird = getOneBird(a);
				if (bird != null) {
					//birds[i] = bird;
					birds.add(bird);
					if ((4 - i) > 0) {
						System.out.println("���Ѿ�ѡ����һֻ" + bird.getName()
								+ ",��������ѡ��" + (4 - i) + "ֻС��");
					}
				}
			} catch (AppException e) {
				System.err.println("�쳣���룺" + e.getErrcode() + "!"
						+ e.getErrmsg());
				// e.printStackTrace();
				//�ָ�i��λ��
				i--;
			}
			//i--;
		}

		return birds;

	}

	/**
	 * ѡ��һֱС�� i:����ı��
	 * */
	public static Bird getOneBird(int i) throws AppException {
		for (Bird b : DataInit.birdtypes) {
			if (i == b.getId()) {
				return b;
			}
		}
		throw new AppException("ѡ��С�����ʹ���������ѡ��", 250);
	}
}
