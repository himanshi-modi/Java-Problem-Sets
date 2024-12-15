import java.util.Scanner;
public class GreatestOfInput {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int greatest=1;

        while(true){
            System.out.println("Enter a number to find greatest or enter 0 to stop: ");
            int input=obj.nextInt();
            if (input==0){
                break;
            }   
            if (input>greatest){
                greatest=input;
            }
        }
        System.out.println("The greatest number is: "+greatest);
    }
    
}
