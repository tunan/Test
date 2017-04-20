package com.lecheng.abgame.game;
	/**
	 * 初始化小鸟数据
	 * */
public class DataInit {
	//鸟类的数组，相当于一个全局变量
	public static Bird[] birdtypes=new Bird[3];
	/**
	 * 初始化三种小鸟的数据
	 * 静态代码块在系统值执行一次
	 * */
	static{
		//利用多态，对于多态的存在条件：继承，重写，向上转型（父类引用指向子类实例）
		
		//初始化红色小鸟的数据
		Bird b1=new RedBird();
		b1.setId(1);
		b1.setName("红色小鸟");
		b1.setAttackValue(80);
		b1.setHitValue(50);
		//初始化黑色小鸟的数据
		Bird b2=new BlackBird();
		b2.setId(2);
		b2.setName("黑色小鸟");
		b2.setAttackValue(200);
		b2.setHitValue(30);
		//初始化蓝色小鸟的数据
		Bird b3=new BlueBird();
		b3.setId(3);
		b3.setName("蓝色小鸟");
		b3.setAttackValue(50);
		b3.setHitValue(80);
		
		//将每种小鸟存入数组中
		birdtypes[0]=b1;
		birdtypes[1]=b2;
		birdtypes[2]=b3;
	}
}
