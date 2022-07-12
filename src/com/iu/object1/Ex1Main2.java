package com.iu.object1;

import java.util.Scanner;

public class Ex1Main2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램 시작");
		Student []sts = new Student[3];
		Student st = new Student();
		
		for(int i=0; i<3; i++)
		{
			System.out.println("이름 입력");
			sts[i].classNames=sc.next();
			sts[i]=st;
		}
		for(int i=0; i<sts.length;i++)
		{
			System.out.println(sts[i].classNames);
		}
		
		
		System.out.println("프로그램 종료");

	}

}
