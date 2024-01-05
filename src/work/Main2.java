package work;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print(" (1'den 7' qeder reqem yazin): ");
	        int input = scanner.nextInt();

	        
	        DayOfWeek day = getDayOfWeek(input);

	        if (day != null) {
	            System.out.println("Yazdiqimiz reqeme cixan gun: " + day);
	        } else {
	            System.out.println("Sef reqem. 1 den 7 ye qeder.");
	        }

	        scanner.close();
	    }

	    
	    public static DayOfWeek getDayOfWeek(int number) {
	        switch (number) {
	            case 1:
	                return DayOfWeek.MONDAY;
	            case 2:
	                return DayOfWeek.TUESDAY;
	            case 3:
	                return DayOfWeek.WEDNESDAY;
	            case 4:
	                return DayOfWeek.THURSDAY;
	            case 5:
	                return DayOfWeek.FRIDAY;
	            case 6:
	                return DayOfWeek.SATURDAY;
	            case 7:
	                return DayOfWeek.SUNDAY;
	            default:
	                return null;
	        }
	    }
	

}


