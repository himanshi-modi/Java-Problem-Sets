public class Palindrome {
    public static void main(String[] args) {
        int number=12321;
        
        int originalNumber=number;
        int reversedNumber=0;

        while(number>0){
            int digit=number%10;
            reversedNumber=reversedNumber*10+digit;
            number=number/10;

        }
        if (originalNumber==reversedNumber){
            System.out.println(originalNumber+" is a palindromic number.");
        }else{
            System.out.println(originalNumber+" is not a palindromic number.");
        }
    }
}
