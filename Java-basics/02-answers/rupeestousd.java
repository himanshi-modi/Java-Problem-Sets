import java.util.Scanner;
public class rupeestousd {
    public static void main(String[] args) {
        Scanner r1=new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        int rupees=r1.nextInt();
        int usd=rupees/84;
        System.out.println(rupees+" is "+usd+" in USD");

    }
}
