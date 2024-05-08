package innerclass.ex1;

class A {
	int num = 10;
}

class B {
	
	void method() {
		A a = new A();
		System.out.println(a.num);
	}
}
