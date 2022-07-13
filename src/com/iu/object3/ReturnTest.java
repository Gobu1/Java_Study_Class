package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest 
{
	//makeAccount 메서드 호출시 통장계설 - 통장명, 예금주, 계좌번호, 잔액을 입력 받아서 리턴 
	public Account makeAccount() //클래스는 데이터타입
	{
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		ac.title="자유";
		ac.host="고";
		ac.numbers="135435153";
		ac.balance=111111111111111L;
		
		return ac;
		
	}
	
	
	//메서드 ㅎ출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRadom2(int count) 
	{
		Random random = new Random();
		int []nums = new int [count];
		for (int i=0; i<count; i++)
		{
//			int num = random.nextInt(50);
//			nums[i]=num;
			nums[i] = random.nextInt(50);
		}
		
		return nums;
	}
	public int makeRandom()
	{
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 리턴하려는 Data
		return num;
	}
	
	public void info() 
	{
		System.out.println("실행 후 그냥 종료");
	}

}
