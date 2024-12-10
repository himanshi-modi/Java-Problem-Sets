import java.util.Scanner;
public class CalculateComiisionPercentage {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the commisiion amount: ");
        double comissionAmount=obj.nextDouble();
        System.out.print("Enter the total no of sale: ");
        double totalSales=obj.nextDouble();
        double commissionPercentage=(comissionAmount/totalSales)*100;
        System.out.println("The comission percentage is "+commissionPercentage+"%");
        
    }
}
