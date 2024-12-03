import java.util.Scanner;
public class sumofx {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter a number or enter x to stop");
        int sum=0;
        while(true){
            String input=n1.next();
            if (input.equalsIgnoreCase("x")){
                break;
            }
            try {
                int number=Integer.parseInt(input);
                sum=sum+number;
               
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input, enter x or a number");
            }
        }
        System.out.println("The sum is "+sum);
    }
}