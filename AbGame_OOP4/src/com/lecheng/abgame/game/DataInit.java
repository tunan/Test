package com.lecheng.abgame.game;
	/**
	 * ��ʼ��С������
	 * */
public class DataInit {
	//��������飬�൱��һ��ȫ�ֱ���
	public static Bird[] birdtypes=new Bird[3];
	/**
	 * ��ʼ������С�������
	 * ��̬�������ϵͳִֵ��һ��
	 * */
	static{
		//���ö�̬�����ڶ�̬�Ĵ����������̳У���д������ת�ͣ���������ָ������ʵ����
		
		//��ʼ����ɫС�������
		Bird b1=new RedBird();
		b1.setId(1);
		b1.setName("��ɫС��");
		b1.setAttackValue(80);
		b1.setHitValue(50);
		//��ʼ����ɫС�������
		Bird b2=new BlackBird();
		b2.setId(2);
		b2.setName("��ɫС��");
		b2.setAttackValue(200);
		b2.setHitValue(30);
		//��ʼ����ɫС�������
		Bird b3=new BlueBird();
		b3.setId(3);
		b3.setName("��ɫС��");
		b3.setAttackValue(50);
		b3.setHitValue(80);
		
		//��ÿ��С�����������
		birdtypes[0]=b1;
		birdtypes[1]=b2;
		birdtypes[2]=b3;
	}
}
