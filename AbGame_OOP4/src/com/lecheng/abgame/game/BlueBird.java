package com.lecheng.abgame.game;

public class BlueBird extends Bird {

	@Override
	public void display() {
		System.out.println("��ӯ����ɫС��ɹ����ˣ����Ĺ���ֵΪ��"+getAttackValue());

	}

	@Override
	public void attack() {
		System.out.println("��ӯ����ɫС��ʼ��������������������");

	}

}
