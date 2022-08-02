package omar.com;
import java.text.NumberFormat;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String newCurrency = currency.format(100);

        System.out.println(newCurrency);
//        Random random = new Random();
//        int number = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//        int triess =0;
//        while (true){
//            System.out.println("Entar A number:");
//            int guess = scanner.nextInt();
//            ++triess;
//
//            if (guess == number){
//                System.out.println("Waad guulelysaty Eng");
//                break;
//            }
//            else if (guess < number){
//                System.out.println("To low");
//            }
//            else {
//                System.out.println("To Hight");
//            }
//        }
//        System.out.println("It took you" +triess +"tries win"




//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Your Name:");
//        String  name = input.nextLine();
//        System.out.println(name.t(2));
//        System.out.println(name);

        






    }
}
