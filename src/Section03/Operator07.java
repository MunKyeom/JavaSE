package Section03;
/*
 *  7. 쉬프트 연산자
 *   << : 지정한 수만큰 비트를 전부 왼족으로 이돌
 *   >> : 부호를 유지하면서 지정한 수만큰 비트를 전부 오른조그올 이동
 * 
 * 
 */
public class Operator07 {
	public static void main(String[] args) {
		int x = 3; // 0011
		int y = 7; // 0111
		
		System.out.println(x << 2); // 0011 << 2 -> 1100 : 12
		System.out.println(y >> 2); // 0111 >> 2 -> 0001 : 1
	}

}
