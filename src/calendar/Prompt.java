package calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="> ";
	
	public void runPrompt() {
		
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("연도를 입력하세요.");
			System.out.print(PROMPT);
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int mon = scanner.nextInt();
			if( mon == -1 || year == -1)
			{
				System.out.println("Have a nice day!");
				break;	
			}
			if( mon > 12)
				continue;
			cal.printCal(year, mon);
		}
		scanner.close();
	}
	public static void main(String[] args) {
		//입력받은 월의 최대 일수 출력하기
				Prompt p = new Prompt();
				p.runPrompt();
			}
}
