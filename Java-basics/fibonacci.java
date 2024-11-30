import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner n1= new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacci series");
        int number=n1.nextInt();
        int first=0;
        int second=1;
        for(int i=0;i<=number;i++){
           System.out.println(first+" ");
           int next=first+second;
           first=second;
           second=next;


        }
    }
}
