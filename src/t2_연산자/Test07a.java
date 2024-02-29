package t2_연산자;

import java.util.Scanner;

//점수를 입력 받아 점수가 90점 이상은 'A', 80점 이상은 'B', 70점 이상은 'C', 60점 이상은 'D', 60점 미만은 'F 학점으로 출력하시오
public class Test07a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum;
		char res;
		
		System.out.print("점수를 입력하세요~!  ");
		jum = sc.nextInt();
		
		res = (jum >= 90) ? 'A' : (jum >= 80) ? 'B' : (jum >= 70) ? 'C' : (jum >= 60) ? 'D' : 'F';
		
		System.out.println( jum + "점은 "+res+" 입니다.");
		
		sc.close();
		
	}
}
