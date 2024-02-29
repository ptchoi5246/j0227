package t3_제어문;

import java.util.Scanner;

//점수가 60점 이상이면 '합격', 미만이면 '불합격' 처리하시오.
public class Test04 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int jumsu = 0; //숫자 변수면 0을 주고 가는게 낫다. 
		String res = "";
		
		System.out.print("점수를 입력하세요!  ");
		jumsu = sc.nextInt(); //점수의 숫자를 입력받는다.
		
		if (jumsu >= 60) res = "합격"; 
		else res = "불합격";
		
		System.out.println("점수 "+jumsu+"은 "+res+" 입니다.");
		
		
		sc.close();
	}
}
