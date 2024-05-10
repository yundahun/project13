package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
		
		String[] arr = {"aaa", "aaa", "b", "b", "ccccc"};
		
		// 1. 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요. 결과:3
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1.filter(s -> s.length() > 2).count();
		
		System.out.println(count);
		
		// 2. 모든 문자열의 길이를 더한 합을 구하세요. 결과: 13
		Stream<String> stream2 = Arrays.stream(arr);
		
		int sum = stream2
				.mapToInt(s -> s.length())
				.sum(); // sum은 기본형만 사용가능
		
		System.out.println(sum);
		
		// 3. 가장 길이가 짧은 문자열의 길이를 구하세요. 결과: 1
		Stream<String> stream3 = Arrays.stream(arr);
		
		OptionalInt min = Arrays.stream(arr)
				.mapToInt(s -> s.length()) // min을 쓰기 위해 map x
				.min();
		
		System.out.println(min.getAsInt());
		
		
		
		// 4. 중복을 제거한 리스트를 만드세요. 결과: [aaa,b,cccc]
		Stream<String> stream4 = Arrays.stream(arr);
		
		List<String> list = stream4
							.distinct()
							.collect(Collectors.toList());
		
		System.out.println(list);

	}

}
