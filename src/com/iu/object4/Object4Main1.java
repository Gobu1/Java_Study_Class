package com.iu.object4;

import java.awt.Color;

public class Object4Main1 
{
	public static void main (String []args)
	{
		Resume re = new Resume();
		Car car1 = new Car();
//		car1.brand="토레스";
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();
		
		Car car3 = new Car("hhh", "Yellow");
		car3.info();
	}

}
