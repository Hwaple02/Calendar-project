package calendar;

public class Calendar {
	public void printCal(int year, int month) {
		System.out.printf("     <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" ---------------------");
		
		int max = maxDay(month);
		
		for(int i=0; i<max; i++)
		{
			System.out.printf("%3d", i+1);
			if( (i+1)%7 == 0 )
				System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public int maxDay(int month)
	{
		return MAX_DAYS[month-1];
	}
	
}