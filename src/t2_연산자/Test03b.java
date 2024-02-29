package t2_연산자;

// 삼항 연산자 (조건식 ? 참 : 거짓)
public class Test03b {
	public static void main(String[] args) {
	// 점수가 90점 이상이면 'A', 90점 미만은 'B'로 처리하시오.
		int jum = 70;
		char res; //char 문자 변수 '' 작은 따옴표 사용
		
		res = (jum >= 90 ? 'A' : 'B');
		System.out.println("점수 "+jum+"점은 "+res+"입니다.");
	}
}
