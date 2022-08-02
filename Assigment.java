//package omar.com;
//
//import java.util.Scanner;
//
//public class Assigment {
//    public static void main(String[] args) {
//       int ch ,number,n1,n2,n3;
//        Scanner userInput = new Scanner(System.in);

//        final  int NUMBER_OF_QUETIONS = 5; // NUMBER OF QUESTIONS
//        int correctCounter = 0; // Count the number of correct Answer //
//        int count =0; // count number of questions
//        long StarTime = System.currentTimeMillis();
//        String output = ""; // output string is initially empty
//        Scanner userIput = new Scanner(System.in);
//        while (count < NUMBER_OF_QUETIONS){
//            // 1. Generate two Ramadan single-digit integers //
//            int number1 = (int) (Math.random()*10);
//            int number2 = (int) (Math.random()*10);
//            // 2. if number1 < number. swap number1 with number2
//            if (number1 < number2){
//                int tamp = number1;
//                number1=  number2;
//                number2 = tamp;
//            }
//            // 3. Prom the Student to answer "What is number1-  number2">?
//
//            System.out.println("What is " +number1+ "-" + number2 + " ?");
//            int answer = userIput.nextInt();
//
//            // 4. Grade the anwser and display the resualt
//
//            if (number1- number2 ==answer){
//                System.out.println("You Are Correct ");
//                correctCounter++;  // Increase the correct answer count
//            }
//            else
//                System.out.println("Your answer is Wrong.\n" +number1 + "-" +number2 + " Should be "
//                        +((number1-number2)));
//            // Increase the question //
//            count++;
//
//        }
//        long endTime = System.currentTimeMillis();
//        long tesTime = endTime - StarTime;
//        System.out.println("correct Answer is " + correctCounter + " \n Test Time is "
//                + tesTime/1000 + " Seconds\n " +output);
//
//        System.out.println("Enter Your Choice");
//        ch = userInput.nextInt();
//        switch (ch){
//            case 1:
//                int number3 = n1 + n2;
//                System.out.println("Addtion = " +n3);
//                break;
//            case 2:
//                n3 = n1*n2;
//                System.out.println("Multipaltion = " +n3);
//                break;
//            case 3:
//                n3 = n1-n2;
//                System.out.println("Subraction = "+n3);
//                break;
//            case 4:
//                n3 = n1/n2;
//                System.out.println("Divition =" +n3);
//            default:
//                System.out.println("invalid Opptions");
//
//
//        System.out.println("_________________________Quiz is Ending Enjoy Your Resulat");
//    }
//}


       




