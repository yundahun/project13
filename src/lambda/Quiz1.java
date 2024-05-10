package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MyNumberImpl();
		
		System.out.println(number1.max(10, 20));
		
		// Q.익명 클래스를 사용하여 max()를 호출하세요
		MyNumber number2 = new MyNumber() {

			@Override
			public int max(int x, int y) {
				int max = x > y ? x : y;
				return max;
			}
			
		};	
		System.out.println(number2.max(10, 20));
		
		// Q.람다식 함수를 사용하여 max()를 호출하세요
		MyNumber number3 = (x, y) -> {
			int max = x > y ? x : y;
			return max;
		};
	}

}

//함수형 인터페이스
@FunctionalInterface
interface MyNumber {
	int max(int x, int y);
}

// 구현 클래스 만들기
class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		// 최대값을 저장할 변수
		int max = 0;
		
		if(x > y) {
			return x;
		} else {
			return y;			
		}
	}
}