package t2_연산자;


// 삼항 연산자 (조건식 ? 참 : 거짓)
public class Test3_p {
	public static void main(String[] args) {
		// 점수가 90점 이상이면 'A', 90점 미만은 'B'로 처리하시오.
		
		char res;
		int jum = 75;
		
		/*if(jum >=90) {
			res = 'A';
		}
		else {
			res = 'B';
		}
		System.out.println("점수 : "+jum+"점은 학점 "+res+" 입니다.");
		*/
		
		res = (jum >= 90) ? 'A' : 'B';
		
		System.out.println("점수 : "+jum+"점은 학점 "+res+" 입니다.");
		
		
	}
}



//	char res;
//int jumsu = 75;

//res = (jumsu >= 90) ? 'A' : 'B';
// System.out.println("점수 : "+jumsu+"은 "+res+"학점입니다.");
