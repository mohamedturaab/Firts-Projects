//package omar.com;
//
//import java.util.Scanner;
//
//public class PrintCalender {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        // prompt the user to enter year
//        System.out.println("Enter Full Year");
//        int year = input.nextInt();
//
//        // prompt the user to moth //
//        System.out.println("Enter month as number between 1 and 12:");
//        int month = input.nextInt();
//        // print calendar for the month of the year /
//        printMonth(year,month);
//    }
//    // create method print the calendar for a moth in a year //
//
//    public static  void  printMonth(int year, int month){
//        // print the heading of the calendar//
//        printMonthTitle(year,month);
//
//        // print the body of the calendar //
//
//        printMonthBody(year,month);
//    }
//
//    // create method the month of title //
//
//    public  static  void printMonthTitle(int year, int month){
//        System.out.println("          " +getMonthName(month) + "" + year);
//        System.out.println("____________________________________________");
//        System.out.println("Sat Sun Mon Tue Wed Thu Fri");
//
//    }
//    // create Method get English name of the month //
//
//    public static String getMonthName(String month){
//        String monthName = "";
//        switch (month){
//            case 1: monthName = "January"; break;
//            case 2: monthName = "February"; break;
//            case 3: monthName = "March"; break;
//            case 4: monthName = "April"; break;
//            case 5: monthName = "May" ; break;
//            case 6: monthName = "June"; break;
//            case 7: monthName =  "July"; break;
//            case 8: monthName = "August"; break;
//            case 9: monthName =  "September"; break;
//            case 10:monthName = "October"; break;
//            case 11:monthName = "November"; break;
//            case 12:monthName = "December"; break;
//
//
//        }
//        return monthName;
//    }
//    // Create Method month body //
//
//    public static void printMonthBody(int year, int month){
//        int starDay = getStarDay(year, month);
//
//        // get number of day in month //
//
//        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
//
//        // pad space before the firs day of the mont //
//
//        int i =0;
//        for (i =0; i <starDay; i++)
//            System.out.println("    ");
//        for (i =1; i<=numberOfDaysInMonth; i++) {
//            System.out.printf("%4d", i);
//            if ((i + starDay) % 7 == 0)
//                System.out.println();
//
//        }
//        System.out.println();
//    }
//    // create method getSatr day of month /1 year/
//
//    public static int getStarDay(int year, int month){
//        final int START_DAY_FOR_JAN_1_1800 = 3;
//
//        // get total number of days from 1/1/1800 to month / 1 year//
//        int totalNumberOfDays = getTotalNumberOfDays(year, month)
//    }
//}
