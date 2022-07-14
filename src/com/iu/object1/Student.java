package com.iu.object1;

public class Student
{
	//멤버변수
	int classNums ;
	String classNames;
	int lan;
	int math ;
	int eng;
	int total;
	double score ;
	
	public void setTotal()// 갈색은 지역변수
	{
		total = this.lan+this.math+this.eng; //참조변수 this. 객체 생성시 만들어지는 주소값을 담고있다.
	}
	public void setScroe()
	{
		this.score = this.total/3;
	}
	
}
