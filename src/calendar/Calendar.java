package calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
//입력받은 두 수의 합을 출력하기
		System.out.println("두 수를 입력하세요.");
		
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		
		int i = Integer.parseInt(a);
		int k = Integer.parseInt(b);
		
		//System.out.println("두 수의 합은 " + (i+k) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", i, k, (i+k));
		s.close();
	}
}
