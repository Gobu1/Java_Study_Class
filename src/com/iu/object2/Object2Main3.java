package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Method3 mt = new Method3();
		int salary = 5000000;
		mt.sal(salary);
		mt.hap(10, 64);
		
//		String name = sc.next();
//		int age = sc.nextInt();
//		String mail = sc.next();
		
//		mt.info(name, age, mail);
		
		Member member = new Member();
		member.name = "suji";
		member.age = 10;
		member.email = "gogkxgg@ma";
		mt.info2(member);
		System.out.println(member.age);
	}
	
	
}
