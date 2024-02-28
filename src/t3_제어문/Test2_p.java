package t3_제어문;

import java.util.Scanner;

//점수가 60점 이상이면 '합격', 미만이면 '불합격' 처리하시오.
public class Test2_p {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum = 0;
		String res = ""; //문자열 큰 따옴표 사용""
		
		//점수를 입력 받아야한다.
				
		System.out.print("점수를 입력하세요!  ");
		jum = sc.nextInt();
		
		if(jum >= 60) {
			res = "합격";
		}
		else {
			res = "불합격";
		}
		System.out.println("당신의 점수는 "+jum+"으로 "+res+" 입니다.");
		
		sc.close();
	}
}
