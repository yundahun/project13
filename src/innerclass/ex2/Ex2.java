package innerclass.ex2;

class A { // 외부 클래스
	
	int num = 10;
	
	class B { // 내부 클래스
		
		void method() {
			System.out.println(num);
		}
		
	}
	
}