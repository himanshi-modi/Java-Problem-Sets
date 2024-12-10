import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int principal=sc.nextInt();
        
        System.out.print("Enter the rate (in %): ");
        double rate=sc.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time=sc.nextDouble();

        double CompoundInterest=(principal*Math.pow(1+(rate/100), time))-principal;
        System.out.println("The compound Interest is: "+CompoundInterest);

        sc.close();
    }
    
}
