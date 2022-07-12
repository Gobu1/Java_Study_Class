package com.iu.object1;

import java.util.Scanner;

public class Ex1Main
{

	public static void main(String[] args) 
	{
		System.out.println("프로그램 시작");
//		Student student = new Student();
//		student.classNums=1;
//		student.classNames="천상현";
//		student.lan=90;
//		student.math=80;
//		student.eng=90;
//		System.out.println("학생 정보 출력");
//		System.out.println("이름 "+student.classNames+" 번호 "+student.classNums);
//		System.out.println("국어"+student.lan+"  수학"+student.math+"  영어"+student.eng);
//		System.out.println("총합"+student.total+"  평균"+student.score);
		Scanner sc = new Scanner(System.in);
		Student st = null;
		Student []sts = new Student[3];
		for (int i=0; i<3; i++)
		{
			st = new Student();
			System.out.println("이름 입력");
			st.classNames = sc.next();
			sts[i]=st;
			System.out.println(sts[i].classNames);
		}
		

	}
}
