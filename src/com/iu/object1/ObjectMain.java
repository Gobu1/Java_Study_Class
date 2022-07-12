package com.iu.object1;

public class ObjectMain 
{
	public static void main(String []args)
	{
		System.out.println("프로그램 시작");
		//object 생성, 클래스명 변수명 = new 클래스명();
		//데이터타입 변수명					*(생성자)
		Monster monster = new Monster();
		
		//멤버에 접근하는 방식
		//변수명.멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name="오크";
		monster.hp=100;
		monster.level=5;
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//------
	}

}
