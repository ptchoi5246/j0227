package t1_variable;

public class Test02 {
	public static void main(String[] args) { //void : 리턴 타입, 0 
		int a1 = 10;
		int a2 = 010;
		int a3 = 0x10;
		
		System.out.println("a1 : " + a1);
		System.out.println("a2 : " + a2);
		System.out.println("a3 : " + a3);
		System.out.println();
		
		int num = 10;
		
		String binaryNum = Integer.toBinaryString(num);//문자열 선언문 String,  2진수로 변환 :: tobinarystring 
		String octalNum = Integer.toOctalString(num); // 8진수로 변환
		String hexNum = Integer.toHexString(num); //16진수로 변환
		
		System.out.println("10진수 num : " + num);
		System.out.println("2진수 binaryNum : " + binaryNum);
		System.out.println("8진수 octalNum : " + octalNum);
		System.out.println("16진수 hexNum : " + hexNum);
	}
}
