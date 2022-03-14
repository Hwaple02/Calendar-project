package calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
//입력받은 월의 최대 일수 출력하기
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = Integer.parseInt(s);
		
		System.out.printf("%d월은 %d일까지 있습니다.", n, month[n-1]);

	}
}
