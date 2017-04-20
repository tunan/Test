package com.lecheng.abgame.game;

import java.util.ArrayList;
import java.util.List;

import com.lecheng.abgame.bean.Player;

/**
 * 游戏类
 * 
 * */
public class PlayGame {
	//private Bird[] birds=new Bird[5];
	private List<Bird> birds=new ArrayList<Bird>();
	private Player Player;
	
	public List<Bird> getBirds() {
		return birds;
	}
	public void setBirds(List<Bird> birds) {
		this.birds = birds;
	}
	//	public Bird[] getBirds() {
//		return birds;
//	}
//	public void setBirds(Bird[] birds) {
//		this.birds = birds;
//	}
	public Player getPlayer() {
		return Player;
	}
	public void setPlayer(Player player) {
		Player = player;
	}
	/**
	 * 计算是否打中，私有方法，属于类内部，不能在本类以外调用
	 * */
	private int getAttackValue(Bird b){
		//Math.random()返回的是一个0。0-1。0之间的double值（包含0。0，不包含1。0）
		//Math.random()*10：返回的是一个0-10之间的double值（包含0。0，不包含10。0）
		//将产生的double随机数进行四舍五入取整
		long l=Math.round(Math.random()*100);
		int h=b.getHitValue();
		if(l<=h&&l>=1){//1<=l<=h
			//返回小鸟的攻击值
			return b.getAttackValue();
		}
		return 0;
	}
	/*
	 * int number=(int) Math.random()*100+1;
	 * if(b.gethitvalue>=number){
	 * return true;
	 * }
	 * return false;
	 * */
	/**
	 * 攻击一次 私有方法 属于类内部，不能在本类以外调用
	 * 
	 * */
	private int getAttackOnce(Bird bird){
		//调用小鸟展示方法
		bird.display();
		//调用小鸟的攻击方法
		bird.attack();
		//如果命中返回攻击值，没有命中返回0
		int attackValue=getAttackValue(bird);
		if(attackValue>0){
			System.out.println("Boom!!"+bird.getName()+"打中了野猪大王！Lucky！！！");
		}else{
			System.out.println("额  额 。。。。。"+bird.getName()+"没有打中野猪大王！衰！！！！！！！");
		}
		return attackValue;
	}
	/**
	 * 开始游戏的方法
	 * */
	public void play(){
		System.out.println();
		System.out.println();
		System.out.println("模拟游戏画面。。。。。。。。。。");
		int s=0;
		//遍历集合
		for(int i=0;i<birds.size();i++){
			//Bird bird=birds[i];
			Bird bird=birds.get(i);
			if(bird!=null){
				System.out.println(bird.getName()+"发起第"+(i+1)+"次攻击");
				s+=getAttackOnce(bird);
			}
		}
		System.out.println("本次游戏中"+Player.getNickname()+"的总分数为："+s+"分");
	}
}
