package t2_연산자;

public class Test01 {
	public static void main(String[] args) {
		int su = 0;
		System.out.println("1.su : " + su);
		
		su = su + 1;
		System.out.println("2.su : " + su);
		
		su += 1;
		System.out.println("3.su : " + su);
		
		++su;
		System.out.println("4.su : " + su);
		
		su++;
		System.out.println("5.su : " + su);
		System.out.println("====================");
		
		int res; // 굳이 값을 주지 않아도 된다.
		res = su; //res 값을 줬기 때문에
		System.out.println("6.su : "+su+" , res : " + res);
		
		res = ++su + 10; // su : 5, res : 15
		System.out.println("7.su : "+su+" , res : " + res);
		
		
		res = su++ + 10; // su :6, res : 15 **후위연산자 - 계산 먼저 하고 나중에 증가 
		System.out.println("8.su : "+su+" , res : " + res);
		
		res = --su + 10; // su : 5, res : 15 
		System.out.println("9.su : "+su+" , res : " + res);
		
		res = su-- + 10; // su : 4, res : 15  
		System.out.println("10.su : "+su+" , res : " + res);

		res = ++su + su-- + 10; // su :4 , res : 20
		System.out.println("11.su : "+su+" , res : " + res);
	}
}










