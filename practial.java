package omar.com;

import javax.swing.*;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.zip.ZipOutputStream;

public class practial {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);


//        int i = K +2;
//        System.out.println(i);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entar three number:");
//
//        double number1 = scanner.nextDouble();
//        double number2 = scanner.nextDouble();
//        double number3 = scanner.nextDouble();
//
//        double avagera = (number1  + number1 + number3) / 3;
//
//        System.out.println("The avagera is" + number1 + " " +number2 + "  " +number3 + " is" + avagera);


//       guess and game//

//        int number = 0;
//        while (number < 10){
//            ++number;
//            System.out.println(number);
//        }

//        int resualt = Math.max(1,2);
//        System.out.println(resualt);
//
//        int [] array = new int[]{88,4,6,8,99,9,23,};
//
//        int sum = 0;
//        for (int i =0; i < array.length; i++){
//            int number = array[i];
//            System.out.println(number);
//            sum += number;
//        }
//        System.out.println("sum =" + sum);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Entar Your Name:");
//        String name = scanner.nextLine();
//
//        if (name==name){
//            System.out.println("Welcome to java programing Languge");
//        }
//        else if (name!=name){
//            System.out.println("Sory Entar Only Name;");
//        }
//        else {
//            System.out.println("NO!");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Entar Your Age:");
//
//        int age = scanner.nextInt();
//
//        if (age >20){
//            System.out.println("You are big man Weclome:");
//        }
//        else {
//            System.out.println("Sory Still You Are Young");
//        }
        //CA202 java practies//
        // display two add and display resualt//
//             int num1 = 10;
//             int num2 = 20;
//             int sum = num1+num2;
//             int avg =sum/2;
//        System.out.println("Sum is :" + sum);
//        System.out.println("avg is :" + avg);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entar Number1:");
//        int number1 = scanner.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.println("Entar Number2:");
//        int number2 = scanner2.nextInt();
//
////        int sum = 0;
//
//        int resualt = number1+number2;
//
//        System.out.println(" resault " + resualt);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entar your Subject one result:");
//        int subjec1 = scanner.nextInt();
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Entar Your  Subjects two resualt:");
//        int subject2 = scanner2.nextInt();
//
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Entar your Subject three rusualt:");
//        int subjec3 = scanner3.nextInt();
//
//
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Entar your Subjects four rusalt:");
//        int subject4 = scanner4.nextInt();
//
//
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("Entar your subjects five resualt:");
//        int subject5 = scanner5.nextInt();
//
//
//        Scanner scanner6 = new Scanner(System.in);
//        System.out.println("Entar your Subjects six rusalt:");
//        int subjec6  = scanner6.nextInt();
//        int sum = subjec1+subject2+subjec3+subject4+subject5+subjec6;
//        int avg =sum/6;
////        String Status = "Passed";
//        if (avg >50){
//            System.out.println("Your are passed:");
//        }
//        else {
//            System.out.println("Sory failed!!");
//        }
//        System.out.println("Sum is All Subjects :" + sum +  " The Average is  :" +avg);

        // this name casting widening//
//         int myInt = 99;
//         double myDouble = myInt;
//        System.out.println(myInt); // Automatic int to double:
//        System.out.println(myDouble);

        // this name narrowing casting type/

//        double myDouble = 17.4d;
//        int myInt = (int) myDouble;
//        System.out.println(myDouble); // Automatic casting double to int//
//        System.out.println(myInt);

        // math //

//        System.out.println(Math.max(100,900));
//        System.out.println(Math.sqrt(56));
//        System.out.println(Math.abs(-10.4));
//        System.out.println(Math.random());
//         int randomNum = (int)(Math.random()* 100); // to 0 up 100 randaming//
//        System.out.println(randomNum


//        int randomNum = (int) (Math.random()* 100);
//
//        System.out.println(randomNum);

//        Random random = new Random();
//        int number = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Entar a number");
//            int guess = scanner.nextInt();
//
//            if (guess == number) {
//                System.out.println("Waad guuleysaty Eng Hamabayo");
//                break;
//            } else if (guess < number) {
//                System.out.println("low Number");
//            } else {
//                System.out.println("To Hight");
//            }
//
//        }


            // Number formating in java //

//        NumberFormat currency  = NumberFormat.getCurrencyInstance();
//        String result = currency.format(10000);
//
//        System.out.println(result);

//        NumberFormat currency  = NumberFormat.getCurrencyInstance();
//
//        String newCurrency = currency.format(100000.890);
//
//        System.out.println(newCurrency);


//        NumberFormat perecent = NumberFormat.getPercentInstance();
//        String newCurrency = perecent.format(1000);
//
//        System.out.println(newCurrency);
            //compsrison operators...
//        int x =1;
//        int y = 1;
//        System.out.println(x>=y);

            // Logical Operatars//

//        int tempareture = 10;
//
//        boolean isWarm = tempareture > 20 && tempareture < 30;
//        System.out.println(isWarm);

            /// this or operats//
//        boolean hasHeightIncome = true;
//        boolean hasGoodCredit =true;
//        boolean isEligable = hasHeightIncome || hasGoodCredit;
//        System.out.println(hasGoodCredit);

            // this not operatts//

//        boolean hasHeightIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligable = (hasHeightIncome || hasGoodCredit) && ! hasCriminalRecord;

            // if statament//


//        int tempeture = 32;
//        if (tempeture > 30){
//            System.out.println("its hot day");
//            System.out.println("Drink water");
//        }else if (tempeture > 20 && tempeture <=30){
//            System.out.println("Beautiful day Enjoy😋😍");
//        } else {
//            System.out.println("Cold day please wearing jacket");
//        }

            // ternary operats//
//
//        int income = 130_000;
//        String className = income >10_000 ? "Hello Worl" : "Encomig";
//        System.out.println(className);

            // Swicht//

//        String role  = "Admim";
//        switch (role){
//            case "Admin":
//                System.out.println("You are Admin");
//                break;
//            case "moderator":
//                System.out.println("You are moderator");
//                break;
//            default:
//                System.out.println("You are guess");
//
//        }


            //Method uses Scanner Objevcts//

//        Scanner input = new Scanner(System.in);
//         System.out.print("Enter a byte value: ");
//         byte byteValue = input.nextByte();
//
//         System.out.print("Enter a short value: ");
//         short shortValue = input.nextShort();
//
//        System.out.print("Enter an int value: ");
//         int intValue = input.nextInt();
//
//         System.out.print("Enter a long value: ");
//         long longValue = input.nextLong();
//
//         System.out.print("Enter a float value: ");
//         float floatValue = input.nextFloat();


            // Dislpay time System in java//
//        Scanner input = new Scanner(System.in);
//         // Prompt the user for input
//         System.out.print("Enter an integer for seconds: ");
//         int seconds = input.nextInt();
//         int minutes = seconds / 60; // Find minutes in seconds
//         int remainingSeconds = seconds % 60; // Seconds remaining
//         System.out.println(seconds + " seconds is " + minutes +  " minutes and " + remainingSeconds + " seconds");

//
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String newCurrency  = currency.format(100);
//        System.out.println(newCurrency);

//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Entar Your Name:");
//        System.out.println("Entar Your age:");
//
//        String name = userInput.nextLine();
//        int age = userInput.nextInt();
//
//        if (age >20){
//            System.out.println("Welcome to java Programing Languge");
//        }
//        else {
//
//            System.out.println("Sory No taking this Tutorial java");
//        }
//        System.out.println("End Program!!!!!!");


//---------------------------------------------------------------------------------------------------------//
            // date objects in java following exmple is showing you local date//


//        LocalDate myObjecs = LocalDate.now(); // create date Objest//
//        System.out.println(myObjecs); // this an output of your code//

            // Now we creating LocalTime in system//

//        LocalTime myObjec = LocalTime.now();
//        System.out.println(myObjec);


            // Display Current Date and Time//
//
//        LocalDateTime myObjec = LocalDateTime.now();
//        System.out.println(myObjec);
//--------------------------------------------------------------------------------------------------//
            // This Section you see ArrayLsit In java///
//        ArrayList <String> cars = new ArrayList<String>();
//        cars.add("Farari");
//        cars.add("BMW");
//        cars.add("Taxi");
//        cars.add("Btt");
//        cars.add("YYow");

            //-------------------------------------------------------------------------------------------------
            // wirte a program that display the sum , product and average of the element of an interger array/

            // simple//

            // [1,2,-3,5,7]
            //sum = 12 , product -210 , average = 2.4//


            Scanner input=new Scanner(System.in);
            System.out.println("Enter the number:");
            int num=input.nextInt();
            if (num<0)
                System.out.println("Negative");
            else if (num>0)
                System.out.println("Positive");
            else
                System.out.println("Zeo is alweys zero");


        }
    }

