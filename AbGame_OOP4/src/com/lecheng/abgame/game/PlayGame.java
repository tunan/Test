package com.lecheng.abgame.game;

import java.util.ArrayList;
import java.util.List;

import com.lecheng.abgame.bean.Player;

/**
 * ��Ϸ��
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
	 * �����Ƿ���У�˽�з������������ڲ��������ڱ����������
	 * */
	private int getAttackValue(Bird b){
		//Math.random()���ص���һ��0��0-1��0֮���doubleֵ������0��0��������1��0��
		//Math.random()*10�����ص���һ��0-10֮���doubleֵ������0��0��������10��0��
		//��������double�����������������ȡ��
		long l=Math.round(Math.random()*100);
		int h=b.getHitValue();
		if(l<=h&&l>=1){//1<=l<=h
			//����С��Ĺ���ֵ
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
	 * ����һ�� ˽�з��� �������ڲ��������ڱ����������
	 * 
	 * */
	private int getAttackOnce(Bird bird){
		//����С��չʾ����
		bird.display();
		//����С��Ĺ�������
		bird.attack();
		//������з��ع���ֵ��û�����з���0
		int attackValue=getAttackValue(bird);
		if(attackValue>0){
			System.out.println("Boom!!"+bird.getName()+"������Ұ�������Lucky������");
		}else{
			System.out.println("��  �� ����������"+bird.getName()+"û�д���Ұ�������˥��������������");
		}
		return attackValue;
	}
	/**
	 * ��ʼ��Ϸ�ķ���
	 * */
	public void play(){
		System.out.println();
		System.out.println();
		System.out.println("ģ����Ϸ���档������������������");
		int s=0;
		//��������
		for(int i=0;i<birds.size();i++){
			//Bird bird=birds[i];
			Bird bird=birds.get(i);
			if(bird!=null){
				System.out.println(bird.getName()+"�����"+(i+1)+"�ι���");
				s+=getAttackOnce(bird);
			}
		}
		System.out.println("������Ϸ��"+Player.getNickname()+"���ܷ���Ϊ��"+s+"��");
	}
}
