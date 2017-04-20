package com.lecheng.abgame.game;

public class BlueBird extends Bird {

	@Override
	public void display() {
		System.out.println("轻盈的蓝色小鸟飞过来了，他的攻击值为："+getAttackValue());

	}

	@Override
	public void attack() {
		System.out.println("轻盈的蓝色小鸟开始攻击。。。。。。。。");

	}

}
