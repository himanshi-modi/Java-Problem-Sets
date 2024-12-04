
import java.util.Scanner;  //acquiring scanner class
public class Areaofcircle {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);  //creating new object of scanner class
        System.out.print("Enter the radius to find the area: ");
        int radius=obj.nextInt();
        float area=(float)(Math.PI*radius*radius); //casting integer to float
        System.out.println("The area of circle with radius "+radius+" is: "+area);



    }
}
