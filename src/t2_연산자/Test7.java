package t2_연산자;

import java.util.Scanner;

//점수가 90점 이상은 'A', 80점 이상은 'B', 70점 이상은 'C', 60점 이상은 'D', 60점 미만은 'F 학점으로 출력하시오
public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성
		// sc : class 변수
		String res;
		int jumsu;
		
		System.out.printf("점수를 입력하세요!  ");
		jumsu = sc.nextInt();
		
		res = (jumsu >= 90) ? "A" : (jumsu >= 80) ? "B" : (jumsu >= 70) ? "C" : (jumsu >= 60) ? "D" : "F"; 
		//제어문. String 선언으로 "" 사용, Char 선언은 '' 사용
		
		
		System.out.println("점수" +jumsu+" 는 "+res+" 입니다.");
		
		sc.close();
	}
}
