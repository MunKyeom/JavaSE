package Section05;
/*
 * 
 * 별찍기 2중 for 문
 * 
 * 1번
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 2번
 * 
 *     *
 *    **
 *   ***
 *  ****
 * 
 * 3번
 * 
 * 삼각형
 * 
 * 
 * 4번
 * 
 * 마름모
 * 
 * 
 * 5번
 * 
 * 구구단
 * 
 */

public class LoopHomeWork {
	public static void main(String[] args) {
	
		
		for(int i=0; i < 7; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
