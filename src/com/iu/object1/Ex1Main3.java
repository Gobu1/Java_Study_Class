package com.iu.object1;

import java.util.Scanner;

public class Ex1Main3
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student [] sts = new Student[3];
		
		for (int i=0; i<sts.length; i++)
		{
			Student st = new Student();
			sts[i]=st;
			System.out.println("이름 입력");
			sts[i].classNames=sc.next();
		}
		System.out.println(sts[1].classNames);
	}
	

}
