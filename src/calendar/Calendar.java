package calendar;

public class Calendar {
	public void printCal(int year, int month) {
		System.out.printf("     <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" ---------------------");
		
		int max = maxDay(year, month);
		
		for(int i=0; i<max; i++)
		{
			System.out.printf("%3d", i+1);
			if( (i+1)%7 == 0 )
				System.out.printf("\n");
		}
		System.out.printf("\n");
	}
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public boolean isLeapYear(int year)
	{
		if( year%4 == 0 && (year%100 != 0 || year%400 == 0))
			return true;
		else
			return false;
	}
	
	public int maxDay(int year, int month)
	{
		if( isLeapYear(year))
			return LEAP_MAX_DAYS[month-1];
		else
			return MAX_DAYS[month-1];
	}
	
}