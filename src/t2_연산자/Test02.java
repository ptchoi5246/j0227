package t2_연산자;

public class Test02 {
	public static void main(String[] args) {
		int su = 10, res;
		
		res = su / 3;
		System.out.println("res(몫) : " + res);
		
		res = su % 3; //나머지 연산자 : %
		System.out.println("res(나머지) : " + res);
		System.out.println();
		
		System.out.println("10 / 3 = " + (su / 3));
		System.out.println("10 / 3 = " + (su / 3.0)); //정수 / 실수 = 정수->실수 형변환, 실수 / 실수 = 실수
		System.out.println("10 / 3 = " + ((double) su / 3)); //(double)정수 = 강제 형변환
					
		
	}
}
