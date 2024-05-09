package innerclass.ex4;

class Outer {
	
	private int a = 10;
	private static int b = 20;
	
	// 인스턴스 내부클래스
	class InClass {
		int i1 = a; // 외부 클래스의 private 멤버도 사용 가능
		int i2 = b;
	}
	
	
	// 정적 내부클래스
	static class InStaticClass {
		int i2 = b;
	}
}
