package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int maxDay(int month)
	{
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {
//입력받은 월의 최대 일수 출력하기
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int n = scanner.nextInt();		
		System.out.printf("%d월은 %d일까지 있습니다.", n, cal.maxDay(n));
		scanner.close();
	}
}
