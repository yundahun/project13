package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		
		// 구현 클래스 사용하여 helloPrint() 호출
		Hello hello = new HelloImpl();
		hello.helloprint();
		
		// 익명 클래스 사용하여 helloPrint() 호출
		Hello hello2 = new Hello() {
			
			@Override
			public void helloprint() {
				System.out.println("안녕하세요");
			}
		};
		hello2.helloprint();
		
		// 람다식 함수 사용하여 helloPrint() 호출
		Hello hello3 = () -> System.out.println("안녕하세요");
		hello3.helloprint();
	}

}

// 함수형 인터페이스
interface Hello {
	//안녕하세요를 출력하는 메소드
	void helloprint();
}

// Q.Hello의 구현 클래스 만들기
class HelloImpl implements Hello {

	@Override
	public void helloprint() {
		
	}
}