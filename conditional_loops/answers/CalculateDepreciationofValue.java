import java.util.Scanner;
public class CalculateDepreciationofValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the cost of asset: ");
        double costOfAsset= sc.nextDouble();

        System.out.print("Enter the salvage value: ");
        double salvage=sc.nextDouble();

        System.out.print("Enter the useful life (in years): ");
        double year=sc.nextDouble();

        double depreciationValue=(costOfAsset-salvage)/year;
        System.out.println("The depreciation value is: "+depreciationValue);

    }
}
