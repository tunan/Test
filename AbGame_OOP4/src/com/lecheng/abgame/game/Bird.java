package com.lecheng.abgame.game;
/**
 * Bird作为三种小鸟的父类，这样三种小鸟都可以共同使用这些属性
 * */

public abstract class Bird {
	private int id;//表示小鸟的编号
	private String name;//表示小鸟的名字
	private int hitValue;//表示小鸟的命中率
	private int attackValue;//表示小鸟的攻击值
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
	 * 小鸟的展示方法（样子）
	 * */
	public abstract void display();
	/**
	 * 小鸟的攻击方法
	 * */
	public abstract void attack();
}
