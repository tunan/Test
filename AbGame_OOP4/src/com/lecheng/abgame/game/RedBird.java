package com.lecheng.abgame.game;

public class RedBird extends Bird{

	@Override
	public void display() {
		System.out.println("˧���ĺ�ɫС��ɹ����ˣ����Ĺ���ֵΪ��"+getAttackValue());
		
	}

	@Override
	public void attack() {
		System.out.println("˧���ĺ�ɫС��ʼ��������������������");
		
	}

}
