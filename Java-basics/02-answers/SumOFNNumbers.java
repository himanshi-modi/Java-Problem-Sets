import java.util.Scanner;
public class SumOFNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=sc.nextInt();
        int sum=0;

        System.out.println("Enter the numbers: ");
        for(int i=1;i<=no;i++){
            sum=sum+i;
        }
        System.out.println("The sum of "+ no+"numbers is "+sum);

    }
}
