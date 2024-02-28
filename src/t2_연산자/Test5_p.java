package t2_연산자;

// 점수가 60점 이상은 '합격' , 60점 미만은 '불합격'이라고 출력하시오. (String 변수에 담아서 출력하시오.)
public class Test5_p {
	public static void main(String[] args) {
		
		String res;
		int jumsu = 85;
		
		res = (jumsu >= 60) ? "합격" : "불합격" ;
		System.out.println("점수 : "+jumsu+" 는 "+res+" 입니다.");
		
		/*class와 객체가 같다는 조건, Class
		 * 객체를 하려면 무조건 생성을 해야한다. 객체 생성 연산자 : new
		 * ex. atom 객체 생성 : new Atom();
		 * 메모리에 Atom이 들어감. 메모리에 자리를 잡고 있다.
		 * Atom atom = new Atom(); 객체 선언
		 * 
		 * Mbc m = new Mbc(); 
		 * 
		 * 입력을 받는 개체 : scanner
		 * Scanner sc = new Scanner(변수 system.in);
		 * 
		 * */
	}
}
