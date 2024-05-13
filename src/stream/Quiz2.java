package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {

	// filter 함수의 인자는 Predicate
	// Predicate 인터페이스를 람다식 함수로 구현하기
	// 1. 추상메소드 구현한다 2. 람다식함수로 바꾼다
//	boolean test(S s) {
//		return s.endsWtih(".txt");
//	}

	public static void main(String[] args) {
		String[] arr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };

		// 1. 파일 목록 중에서 txt 파일만 찾으세요
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.filter(s -> s.endsWith(".txt")).forEach(s -> System.out.print(s + " "));

		System.out.println();

		// 2. 확장자별로 파일의 개수를 구하세요.
		Stream<String> stream2 = Arrays.stream(arr);
		long txtCount = stream2.filter(s -> s.endsWith(".txt")).count();

		System.out.println(txtCount);
		
		Stream<String> stream3 = Arrays.stream(arr);
		long pdfCount = stream3.filter(s -> s.endsWith(".pdf")).count();

		System.out.println(pdfCount);

		Stream<String> stream4 = Arrays.stream(arr);
		long imgCount = stream4.filter(s -> s.endsWith(".img")).count();
		System.out.println(imgCount);

		// 3. 파일의 확장자만 추출하여 출력하세요.
		Stream<String> stream5 = Arrays.stream(arr);
		stream5 .map(s -> {
			// .을 구분자로 사용하여 문자열을 자름. (점은 특수기호로 표현해야함)
			String[] strArr = s.split("\\.");
			return strArr[1];
		})
		.distinct()
		.forEach(s -> System.out.print(s + " "));
	}

}
