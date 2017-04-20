package com.lecheng.abgame.game;

import java.util.ArrayList;
import java.util.List;
import com.lecheng.abgame.exception.AppException;
import com.lecheng.abgame.ui.InputHelper;
import com.lecheng.abgame.ui.Menu;

/**
 * 选择小鸟辅助类
 * */
public class BirdHelper {
	// 创建数组，用来存储选择的五只小鸟
	//static Bird[] birds = new Bird[5];
	List<Bird> birds = new ArrayList<Bird>();

	public  List<Bird> getchooseBirds() {
		// 显示选择小鸟菜单
		Menu.chooseBirdUI();
		for (int i = 0; i < 5; i++) {
			int a = InputHelper.getInt();
			if (a == 0) {
				return null;
			}
			// 根据编号选择小鸟
			Bird bird;

			try {
				bird = getOneBird(a);
				if (bird != null) {
					//birds[i] = bird;
					birds.add(bird);
					if ((4 - i) > 0) {
						System.out.println("您已经选择了一只" + bird.getName()
								+ ",您还可以选择" + (4 - i) + "只小鸟");
					}
				}
			} catch (AppException e) {
				System.err.println("异常编码：" + e.getErrcode() + "!"
						+ e.getErrmsg());
				// e.printStackTrace();
				//恢复i的位置
				i--;
			}
			//i--;
		}

		return birds;

	}

	/**
	 * 选择一直小鸟 i:代表的编号
	 * */
	public static Bird getOneBird(int i) throws AppException {
		for (Bird b : DataInit.birdtypes) {
			if (i == b.getId()) {
				return b;
			}
		}
		throw new AppException("选择小鸟类型错误，请重新选择：", 250);
	}
}
