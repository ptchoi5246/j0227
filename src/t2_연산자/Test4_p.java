package t2_연산자;

// 삼항 연산자 (조건식 ? 참 : 거짓)
public class Test4_p {
	public static void main(String[] args) {
		// 점수가 90점 이상이면 'A', 점수가 80점 이상이면 'B',점수가 70점 이상이면 'C',점수가 60점 이상이면 'D', 60점 미만은 'F' 학점으로 처리하시오.
		
		char res;
		int jum = 75;
		
		res = (jum >= 90) ? 'A' : (jum >= 80) ? 'B' : (jum >= 70) ? 'C' : (jum >= 60) ? 'D' : 'F';
		System.out.println("점수 "+jum+"점은 "+res+"학점 입니다.");
	}
}
