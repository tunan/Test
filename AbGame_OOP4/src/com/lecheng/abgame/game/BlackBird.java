package com.lecheng.abgame.game;

public class BlackBird extends Bird {

	@Override
	public void display() {
		System.out.println("���صĺ�ɫС��ɹ����ˣ����Ĺ���ֵΪ��"+getAttackValue());
	}

	@Override
	public void attack() {
		System.out.println("���صĺ�ɫС��ʼ��������������������");
	}

}
