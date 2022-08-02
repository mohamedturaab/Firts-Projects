package omar.com;

import java.util.Arrays;
import java.util.Scanner;

public class Arrys {


    public static void main(String[] args) {
//        int[] number  = new int[10];
//        number[0]=19;
//        number[1]=13;
//        number[2]=32;
//        number[4]=20;
//        number[5]=20;
//        number[6]=20;
//        for (int i= 0; i<number.length;i++){
//            System.out.println(number[i]);
//        }


//

        int [] number = new int[6];
//        Scanner input = new Scanner(System.in);
//        for (int i =0; i<number.length;i++){
//
//            System.out.println("Enter Number Array :" +(i+1));
//            number[i] = input.nextInt();
////        }
//        for (int i =0; i<number.length;i++){

//            number[i] = (int)(Math.random()*100);
//            System.out.println("Index of "+i+":" +number[i]);
//        }

          int[] list = {1000,88,99,10,88,100,900};
//          int sum= 0;
//          for (int i = 0; i< list.length;i++){
//              sum+= list[i];
//          }
//        System.out.println("Sum is :" +sum);
//
//          // Find the largest Number in this Arrays //
//          int max = list[0];
//          for (int i = 1; i<list.length;i++){
//              if (list[i] >max){
//                  max = list[i];
//
//              }
//          }
//        System.out.println("The Max Number is :" +max);
//
//          // Random shuffling //
////        System.out.println("Before Random shuffling my list is:" +Arrays.toString(list));
////        for (int i =0; i<list.length;i++){
////            int j = (int)(Math.random()* list.length);
////            int temp = list[i];
////            list[i] =list[j];
////            list[j] = temp;
////        }
////        System.out.println("After Random Shuffting my List" +Arrays.toString(list));
//        System.out.println("Bofere shuffting element" +Arrays.toString(list));
//        int temp = list[0];
//        for (int i =1; i<list.length;i++){
//            list[i-1] = list[i];
//        }
//        list[list.length-1]=temp;
//        System.out.println("After shuffting Element" +Arrays.toString(list));

        // enhance for loops  //

//        for (int value: list){
//            System.out.println(value);
//        }

        // Array Copy
//        int[] myList = {1,2,3,4,5};
//        int[] list2 = new int[6];
//        System.arraycopy(myList,0,list2,0,myList.length);
//        myList[0]=10;
//        System.out.println("MyList is:" +Arrays.toString(myList));
//        System.out.println("List2 is:" +Arrays.toString(list));


        // Create method like main method pareamer Arry //


//         Display(list);
          sum(19,11);
          sum(19,11,100,11,99,99,100);
          sum(19,11,100,11,99,99,100,1000,999,1888,10000);



    }
//    public static void Display(int[]list){
//        for (int value:list){
//            System.out.println(value);
//        }
////        System.out.println(void);

       public static void sum(int...number){
        int sum = 0;
        for (int value:number){
            sum+= value;

        }
           System.out.println("Sum is:" +sum);
       }

    }

