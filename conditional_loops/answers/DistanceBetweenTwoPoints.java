import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1=obj.nextDouble();

        System.out.println("Enter x2: ");
        double x2=obj.nextDouble();

        System.out.print("Enter y1: ");
        double y1=obj.nextDouble();

        System.out.print("Enter y2: ");
        double y2=obj.nextDouble();


        double distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        System.out.println("The distance between two points is: "+distance);
    }
}

    