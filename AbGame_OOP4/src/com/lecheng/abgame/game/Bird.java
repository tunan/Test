package com.lecheng.abgame.game;
/**
 * Bird��Ϊ����С��ĸ��࣬��������С�񶼿��Թ�ͬʹ����Щ����
 * */

public abstract class Bird {
	private int id;//��ʾС��ı��
	private String name;//��ʾС�������
	private int hitValue;//��ʾС���������
	private int attackValue;//��ʾС��Ĺ���ֵ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHitValue() {
		return hitValue;
	}
	public void setHitValue(int hitValue) {
		this.hitValue = hitValue;
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	/**
	 * С���չʾ���������ӣ�
	 * */
	public abstract void display();
	/**
	 * С��Ĺ�������
	 * */
	public abstract void attack();
}
