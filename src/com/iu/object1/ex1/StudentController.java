package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController 
{
	Scanner sc;
	//객체 생성
	StudentView sv;
	StudentService studentService;
	Student [] students;
	
	public StudentController() 
	{
		sc = new Scanner(System.in);
		sv = new StudentView();
		studentService = new StudentService();
	}
	
	//start 메서드를 선언
	public void start()
	{

		boolean check=true;
		while(check)
		{
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 정보 추가");
			System.out.println("6. 프로 그램 종료");
			int select= sc.nextInt();
			switch (select) 
			{
			case 1: 
				System.out.println("1");
				students = studentService.makeStudents();
				break;
			case 2 :
				System.out.println("2");
				sv.view(students);
				break;
			case 3 :
				System.out.println("3");
				Student student = studentService.findStudent(students);
				if(student != null) 
				{
					sv.view(student);
				}else 
				{
					sv.view("찾는 학생번호가 없어요");
				}
				break;
			case 4 :
				System.out.println("4");
				break;
			case 5 :
				System.out.println("5");
				break;
			default:
				System.out.println("종료중");
				check=!check;
			}
		}
		
		
	}

}
//Start메서드를 선언
// 1. 학생 정보 입력, - 학생수, 이름, 번호, 국어 영어 수학 입력후 총점, 평균
// 2. 학생 정보 조회 - 이름, 번호, 총점, 평균 출력
// 3. 학생 정보 검색 - 검색할 학생의 번호를 입력, 입력한 번호와 일치하는 학생의 모든정보 출력, 번호가 없을시 없는학생 출력
// 4. 학생 정보 삭제 - 삭제할 학생의 번호를 입력 , 입력한 번호와 일치할시 학생정보 삭제(배열한칸 삭제) 없는학생 출력
// 5. 학생 정보 추가 - 이름, 번호, 국어, 영어. 수학 입력 후 계산 총점, 평균 추가
// 6. 프로그램 종료 