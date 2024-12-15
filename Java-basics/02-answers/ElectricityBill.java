import java.util.Scanner;
public class ElectricityBill {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter previous meter reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();

        
        int unitsConsumed = currentReading - previousReading;
        System.out.println("Units Consumed: " + unitsConsumed);

        
        double totalBill = 0;

        if (unitsConsumed <= 100) {
            totalBill = unitsConsumed * 3.0; 
        } else if (unitsConsumed <= 300) {
            totalBill = (100 * 3.0) + ((unitsConsumed - 100) * 5.0); 
        } else {
            totalBill = (100 * 3.0) + (200 * 5.0) + ((unitsConsumed - 300) * 7.0); 
        }

       
        double fixedCharges = 100;
        totalBill += fixedCharges;

        
        double tax = totalBill * 0.05;
        totalBill += tax;

        
        System.out.printf("Electricity Bill: ₹%.2f (including ₹%.2f fixed charges and ₹%.2f tax)\n",
                totalBill, fixedCharges, tax);

        scanner.close();
    }
}







