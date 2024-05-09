package lambda;

public class Ex2 {

	public static void main(String[] args) {

		// 부모타입 변수 선언 = 람다식 함수
		Calc calc = (num1, num2) -> num1 + num2;

		Calc calc2 = new Calc() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
	}
}

// 함수형 인터페이스
// 함수형 어노테이션을 나타내는 어노테이션.
// 추상메소드가 한개 이상 추가되는 것을 막음
@FunctionalInterface // 억제기..?
interface Calc {
	int add(int num1, int num2);

}
