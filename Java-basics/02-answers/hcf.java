import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter 'hcf' or 'lcf':");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("hcf")) {
            int hcf = findHCF(no1, no2);
            System.out.println("HCF: " + hcf);
        } else if (input.equalsIgnoreCase("lcf")) {
            int hcf = findHCF(no1, no2);
            int lcm = (no1 * no2) / hcf; // LCM = (num1 * num2) / HCF
            System.out.println("LCF: " + lcm);
        } else {
            System.out.println("Invalid input. Please enter 'hcf' or 'lcf'.");
        }
        sc.close();
    }

    // Method to find HCF using the Euclidean algorithm
    public static int findHCF(int no1, int no2) {
        while (no2 != 0) {
            int temp = no2;
            no2 = no1 % no2;
            no1 = temp;
        }
        return no1;
    }
}
