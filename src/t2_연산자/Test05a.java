package t2_연산자;

// 점수가 60점 이상은 '합격' , 60점 미만은 '불합격'이라고 출력하시오. (String 변수에 담아서 출력하시오.)
public class Test05a {
	public static void main(String[] args) {
		
	int jumsu = 75;
	String res;
	
	res = (jumsu >= 60 ? "합격" : "불합격");
	
	System.out.println("점수 "+jumsu+"점은 "+res+" 입니다."); //String 변수는 문자열! "" 큰따옴표 사용
	}
}
