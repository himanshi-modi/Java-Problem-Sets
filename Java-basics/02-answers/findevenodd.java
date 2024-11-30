import java.util.Scanner;
public class findevenodd {
    public static void main (String args[]){
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        if (n1.hasNextInt()){
            int number=n1.nextInt();
            if (number%2==0){
                System.out.println(number +" is an even number");
            }else{
                System.out.println(number +" is an odd number");
            }
        }else{
            System.out.println("The number is invalid , enter an integer");
        }
    }
}
