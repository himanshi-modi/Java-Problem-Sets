import java.util.Scanner;
public class CalculateBattingAverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the runs scored: ");
        int runScored=sc.nextInt();

        System.out.print("Enter the number of times the player got out: ");
        int timesOut=sc.nextInt();

        int averageBatting=runScored/timesOut;
        System.out.println("The batting average is: "+averageBatting);
    }
}
