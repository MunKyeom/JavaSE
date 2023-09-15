package Section03;

/*
 *  4. 논리 연산자
 *   && : And 조건, 교집함 개념, 두 항 모두 true 일때 true 
 *   || : Or 조건, 합집합 개면, 두 항중 하나이상 T 일때 T
 *   !  : Not 조건, 여집합 개념, 논리(bollean)값 반전 시킨다.
 * 
 * 
 * 
 * 
 */

public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("result: " + result);
		
		int age = 28;
		int sex = 1; //성별 남자:1 여자:2
		if(age >= 19 && sex == 1) {
			System.out.println("성인 남성입니다.");
		}
		
		boolean result2 = true || false;
		System.out.println("result2: " + result2);
		
		result2 = !result2;
		System.out.println("!result2: " + result2);
		
		String category = "식품";
		if(category == "식품" || category == "전기전자" || category == "의류") {
			System.out.println("20% 할인 중");
		} else {
			System.out.println("할인 미적용");
		}
		
		boolean result3 = ((true && true) && true) || false;
		System.out.println(result3);
		
		
		
	}

}
