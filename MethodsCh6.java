package omar.com;

import java.util.Scanner;

public class MethodsCh6 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Yout Score:");
//        double score = input.nextDouble();
//        grade(score);
//        System.out.println("Your Program is End-------");
//        DisplayMessage("Hello CA202",10);

        int number =10;
        System.out.println("Bofere function call value is:"+number);
        increament(10);
        System.out.println("After function call value is:"+number);


    }
//    public static void grade(double score){
//        if (score>100)
//        if (score >=90)
//            System.out.println("Your Grade is A");
//        else if (score >=80)
//            System.out.println("Your Grade is B");
//        else if (score >=70)
//            System.out.println("Your Grade is C");
//        else if (score >=60)
//            System.out.println("Your Grade is D");
//        else
//            System.out.println("Your Are Failed.Be the best ");


//    }

    public static void  DisplayMessage(String message , int number){
        for (int i = 0; i <number;i++)
            System.out.println(message);
    }
    public static void increament(int x){
        x++;
        System.out.println("Inside Function value is:" +x);
    }

}
