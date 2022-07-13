package com.iu.object2;

public class Object2Main4 
{

	public static void main(String[] args) 
	{
		Method4 m4 = new Method4();
		Member member = new Member();
		member.name="it";
		member.age=31;
		member.email="gody@naver.com";
		
		Member member2 = new Member();
		member2.name="it2";
		member2.age=32;
		member2.email="gody2@naver.com";
		
		Member member3 = new Member();
		member3.name="it3";
		member3.age=33;
		member3.email="gody3@naver.com";
		
		Member[]members = new Member[3];
		members[0]=member;
		members[1]=member2;
		members[2]=member3;
		
		m4.info(members);
		
		System.out.println(members.length);
		
		
		
	}

}
