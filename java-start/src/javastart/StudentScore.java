package javastart;

import java.util.Scanner;

class StudentP{
	String name;
	int score;
	
	StudentP(String name, int score){
		this.name = name;
		this.score = score;
	}
	
}


public class StudentScore {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반학생수를 입력하세요: ");
		int cnt = sc.nextInt();
		sc.nextLine();
		StudentP[] stu = new StudentP[cnt];
		//학생수만큼 바로 생성
		
		//반복문을 통해서 배열 요소 객체 생성
		for(int i = 0 ;	i < stu.length	; i++){
			System.out.println((i+1)+"번째 학생 입력: ");
			String name = sc.nextLine();
			
			System.out.println((i+1)+"번째 학생 점수 입력: ");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name,score);
		}
		
		while(true) {
			System.out.println("검색할 이름은: ");
			String sname = sc.nextLine();
			
			if(sname.equals("그만")) break; 
			//while을 탈출한 break //break는 가장 가까운 반복문을 한번만 탈출한다.
			
			boolean k = false;
			for(int j = 0 ; j < stu.length ; j++) {
				
				if(stu[j].name.equals(sname)) {
					System.out.println(sname+"의 정수는: "+stu[j].score);
					k = true;
					break; //if를 탈출한 break
				}//if
				
			}//for
			
			if(!k) {
				System.out.println("없는 사람입니다");
			}//if
	 
			
		}//while
		sc.close();
		System.out.println("프로그램을 종료합니다");
	}//main
	
}//StudentScore
