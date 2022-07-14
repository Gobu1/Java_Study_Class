package com.iu.object1.ex1;

public class Student 
{
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getMum()
	{
		return this.num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	
	public int getKor()
	{
		return this.kor;
	}
	public void setKor(int kor)
	{
		this.kor=kor;
	}
	
	public int getEng()
	{
		return this.eng;
	}
	public void setEng(int eng)
	{
		this.eng=eng;
	}
	
	public int getMath()
	{
		return this.math;
	}
	public void setMath(int math)
	{
		this.math=math;
	}
	
	public int getTotal()
	{
		return this.total;
	}
	public void setTotal(int total)
	{
		this.total=total;
	}
	
	public double getAvg()
	{
		return this.avg;
	}
	public void setAvg(double avg)
	{
		this.avg=avg;
	}
	
	
	public void setTotal() 
	{
		this.total = this.kor+this.eng+this.math;
		this.setAvg();
	}
	
	public void setAvg() 
	{
		this.avg = this.total/3.0;
	}

}