package CollectionEnhancement;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class dateAndTime {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();

		System.out.println(d);

		LocalTime t = LocalTime.now();

		System.out.println(t);

		System.out.println(LocalDateTime.now());

		System.out.println(d.plusDays(5));

		System.out.println(d.minusDays(5));

		// 31-Aug-2022

		LocalDate d1 = LocalDate.of(2022, Month.AUGUST, 31);

		System.out.println(d1);

		// 2 Date Objects

		// Date1=27-09-2022 , Date =31-08-2022
		
		
		Duration dur = Duration.between( d1,d);
		
	//	System.out.println(dur.toDays());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String[]  array= {"aa","bb"};
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(String.join("", array));
		
		System.out.println(String.join(",", array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
