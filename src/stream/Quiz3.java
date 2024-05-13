package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {

	// map 함수의 인자는 Function
	// 인터페이스를 구현하는 방법은 3가지
	// 함수형 인터페이스는 람다식 함수로 구현 가능
	// Function 인터페이스를 람다식 함수로 구현하기
	// 1. 추상메소드 구현한다. 2. 람다식 함수로 바꾼다
	
	// 추상메소드의 기능은 해당 연산자의 기능과 같다
	
	// 이 함수는 요소를 다른값으로 바꿔서 반환하는 함수
	// 리터타입 R? 제네릭 타입이라는거. 여러분들이 정해주시면 됨
	
//	R apply(T t) { // t는 주문 객체
//		reutrn t.orderNo; // 주문 번호로 바꿔서 반환
//	}
	
	// 추상메소드의 기능은 filter 함수의 기능과 같다
	
	// 주문일자가 2022년도면 true를 반환
//	boolean test(T t) {
//		if(t.year == 2022) { // t는 주문 객체
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	long count1 = list.stream()
//			.filter( t -> {
//				if(t.year == 2022) { // t는 주문 객체
//					return true;
//				} else {
//					return false;
//				}
//			})
//			.map(n -> n.orderNO)
//			.count();
	
	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		Stream<Order> stream1 = list.stream();
		
		stream1
			.map(n -> n.orderNO)
			.forEach(s -> System.out.print(s + " "));	
				
		System.out.println();
		
		// 2. 22년도 총금액과 건수
		int sum1 = list.stream()
			.filter(n -> n.year == 2022)
			.mapToInt(n -> n.price)
			.sum();
		
		System.out.print("2022년도 총 금액:" + sum1);
		long count1 = list.stream()
					.filter(n -> n.year == 2022)
					.map(n -> n.orderNO)
					.count();
		
		System.out.println(" 거래건수:" + count1);
		
		// 3. 23년도 총금액과 건수
		int sum2 = list.stream()
				.filter(n -> n.year == 2023)
				.mapToInt(n -> n.price)
				.sum();
			
		System.out.print("2023년도 총 금액:" + sum2);
			
			long count2 = list.stream()
					.filter(n -> n.year == 2023)
					.map(n -> n.orderNO)
					.count();
		
		System.out.println(" 거래건수:" + count2);
			
	}

}

class Order {
	int orderNO;
	int year;
	int price;
	
	public Order(int orderNO, int year, int price) {
		super();
		this.orderNO = orderNO;
		this.year = year;
		this.price = price;
	}
	
}