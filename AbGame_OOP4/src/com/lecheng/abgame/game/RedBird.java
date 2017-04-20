package com.lecheng.abgame.game;

public class RedBird extends Bird{

	@Override
	public void display() {
		System.out.println("帅气的红色小鸟飞过来了，他的攻击值为："+getAttackValue());
		
	}

	@Override
	public void attack() {
		System.out.println("帅气的红色小鸟开始攻击。。。。。。。。");
		
	}

}
