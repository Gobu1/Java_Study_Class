package com.iu.object4;

public class Car 
{
	String company="쌍용"; //변수선언과 동시에 초기화
	String brand;
	String color;
	boolean gear; //true 오토, false 수동
	
	public Car()
	{
		System.out.println();
		
//		this.company="현대";
//		this.brand="아반떼";
//		this.color="white";
//		this.gear=true;
	}
	public Car(String color)
	{
		this("77","gold");
//		this.company="기아";
//		this.brand="K5";
//		this.color=color;
//		this.gear=false;
	}
	public Car(String brand, String color)
	{
		this.company="쉐보레";
		this.brand=brand;
		this.color=color;
		this.gear=false;
	}
	
	//Instance 초기화 블럭{}
	{
//		this.company="기아";
//		this.brand="K5";
//		this.color="Black";
//		this.gear=false;
	}
	
	
	public void info()
	{
		System.out.println("Company : " + this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Gear : "+this.gear);
		
	}

}
