package t2_연산자;

import java.util.Scanner;

// 점수를 입력받아 점수가 60점 이상은 '합격' , 60점 미만은 '불합격'이라고 출력하시오. (String 변수에 담아서 출력하시오.)
public class Test06a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jumsu = 0;
		String res;
		
		System.out.print("점수를 입력하세요~!  ");
		jumsu = sc.nextInt();
		
		res = (jumsu >= 60) ? "합격" : "불합격";
		
		System.out.println(""+jumsu+"점은 "+res+"입니다.");
		
		sc.close();
	}
}
