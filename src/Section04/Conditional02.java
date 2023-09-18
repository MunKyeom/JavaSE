package Section04;
/*
 *  1-2. if~else 문
 *  	if(조건식) {
 *  		조건식 true일때 실행 명령문
 *  	} else {
 *  		조건식 False일때 실행 명령문
 *  	}
 *  
 * 
 * 
 * 
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num =7;
		
		if(num % 2 ==0) {
			System.out.println("num은 짝수");
		} else {
			System.out.println("num은 홀수");
		}
		
		if(num % 2 ==0) 
			System.out.println("num은 짝수");
		 else 
			System.out.println("num은 홀수");
		
		
	}

}
