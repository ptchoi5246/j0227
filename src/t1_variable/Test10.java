package t1_variable;

public class Test10 {
	public static void main(String[] args) {
		double res;
		double r = 10;
		res = r * r * 3.14;
		System.out.println("res : " + res);
		
		//res = 10 / 3.0 ; // 정수 / 정수 연산 = 정수, 정수 / 실수 연산 = 실수
		res = (double) 10 / 3; //강제 casting 10
		//res = 10 / (double) 3; //강제 casting 3
		System.out.println("res : " + res);
	}
}
