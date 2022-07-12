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
		//-----------
		Monster monster2 = new Monster();
		monster2.name="오크";
		monster2.hp=100;
		monster2.level=100;
		System.out.println(monster==monster2);
		
		//멤버변수의 데이터타입에는 제한이 없다.
		Weapon sword = new Weapon();
		sword.name="단검";
		sword.damage=10;
		sword.inchant=1;
		monster.weapon = sword;
		System.out.println(monster.weapon.name);
		System.out.println(monster2.weapon.name);
		
		
		
	}

}
