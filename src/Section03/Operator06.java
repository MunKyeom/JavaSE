package Section03;

/*
 *  6. 비트 연산자
 *   2진수로 표현된 두 비트 연산자
 *   
 *   & : 대응되는 비트중 모두 1이면 1을 반환(비트 And 연산자)
 *   | : 대응되는 비트중 하나라도 1이면 1을 반환 (비트 Or 연산자)
 *   ^ : 대응되는 비트가 서로 다르면 1을 반환(비트 XOR(Exclusive) 연산자)
 *   ~ : 대응되는 비트가 1이면 0으로, 0이면 1로 반전 (비트 Not 연산자)
 * 
 * 
 */
public class Operator06 {
	public static void main(String[] args) {
		int num1 = 3; // 0011
		int num2 = 5; // 0101
		/*
		 * 3:0011
		 * 5:0101
		 *
		 * &:0001 ->1
		 * |:0111 ->7
		 * ^:0110 ->6
		 * 
		 * 3:0 0011
		 * ~:1 1100
		 * 
		 * CPU는 뺄샘을 못함 -> +를 사용하자 보수를 이용하자
		 * 
		 * 5-3 =2
		 * 5:0 0101 -         0101
		 * 3:0 0011 -(1의보수)> 1100 (-3)
		 *                   10001 -> 0001 + 1 -> 0010
		 * 
		 * 1의보수  - >                 2의보수( 중복된 -0을 없기위해)
		 * 1:0 0001 ->1 1110  : -1
		 * 2:0 0010 ->1 1101  : -2
		 * 0:0 0000 ->1 1111  : -0    
		 * 
		 * 
		 * 
		 */
		System.out.println("num1 & num2: " +(num1 & num2));
		System.out.println("num1 | num2: " +(num1 | num2));
		System.out.println("num1 ^ num2: " +(num1 ^ num2));   // Ctrl + Alr 방향키 아래 는 줄복사 붙여 넣기
		
		System.out.println("~num1: " + ~num1);
	}

}
