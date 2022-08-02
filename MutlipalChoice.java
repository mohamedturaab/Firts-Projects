package omar.com;

import java.util.Scanner;

public class MutlipalChoice {
    public static void main(String[] args) {
        String Answer1 =  "";
        Scanner keyboard = new Scanner(System.in);

        int numberCorrecty = 0;
        int questions =10;


        System.out.println("What is the  sum of 4 and 10 (What is 4+10)");
        System.out.println("A: 10");
        System.out.println("B: 14");
        System.out.println("C: 8");
        System.out.println("D: None");
        System.out.println("________________");
        Answer1 = keyboard.nextLine();
        if (Answer1.equals("B")){
            System.out.println("Good Job that's correc answer");
            numberCorrecty+=1;
        }
        else {
            System.out.println("That's Wrong dumy");
        }
    }
}
