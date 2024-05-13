package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		Stream<Customer> stream1 = list.stream();
		
		// 고객 명단
		stream1
			.map(s -> s.name)
			.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		// 여행의 총 비용
		int sum = list.stream()
			.mapToInt(n -> n.cost)
			.sum();
		
		System.out.println("총 여행의 비용 :" + sum);
		
		// 20세 이상 고객 명단
		System.out.println("== 20세 이상 고객 명단 ==");

		list.stream()
			.filter(s -> s.age >= 20)
			.sorted((o1,o2) -> { // 순정렬
				if(o1.age > o2.age) {
					return 1;
				} else {
					return -1;
				}
			})
			.forEach(s -> System.out.println(s.name + ", " + s.age)); // map 사용불가

	}

}

class Customer {
	String name;
	int age;
	int cost;
	
	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
}