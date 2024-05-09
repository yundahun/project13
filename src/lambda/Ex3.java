package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("add");
		list.add("ccc");
		list.add("bbb");

		// 리스트의 요소를 순서대로 정렬하는메소드
		// 인자: 1.문자열 리스트
		//		2.리스트 정렬하는 로직을 가지고 있는 Comparator 클래스
		
		// 1.클래스로 인터페이스 구현하기
		// 2.익명클래스로 인터페이스 구현하기
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); // 순정렬
			}
			
		});
		System.out.println("리스트 순정렬: " + list);
		
		
		// 3. 람다식으로 인터페이스 구현하기
		Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
		System.out.println("리스트 역정렬: " + list);
	}

}
