
import java.util.Scanner;
public class MaxMinFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int number1=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int number2=sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int number3=sc.nextInt();
        System.out.println("Enter 'max' to find maximum or 'min' to find minimum: ");
        String str=sc.next();
        if (str.equals("max")){
            findMaximum(number1,number2,number3);
        }else if(str.equals("min")){
            findMinimum(number1,number2,number3);
        }else{
            System.out.println("Invalid Input");
        }
    }
    static void findMaximum(int number1,int number2,int number3){
        if (number1>number2 && number1>number3){
            System.out.println(number1+" is greater");
        }else if (number2>number1 && number2>number3){
            System.out.println(number2+" is greater");
        }else{
            System.out.println(number3 +" is greater");
        }
    }
    static void findMinimum(int number1,int number2,int number3){
        if (number1<number2 && number1<number3){
            System.out.println(number1+" is smallest");
        }else if (number2<number1 && number2<number3){
            System.out.println(number2+" is smallest");
        }else{
            System.out.println(number3 +" is smallest");
        }
    }

}
