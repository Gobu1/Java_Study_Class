package com.iu.object1.ex1;

public class StudentView 
{
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void view(String message) 
	{
		System.out.println(message);
	}
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보를 출력
	public void view(Student student) 
	{
		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.total);
		System.out.println(student.avg);
	}
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void view(Student [] students) 
	{
		for(int i=0;i<students.length;i++) 
		{
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
		}
		
		
	}
	

}