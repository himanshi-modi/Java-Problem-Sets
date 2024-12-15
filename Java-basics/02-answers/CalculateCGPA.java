import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sum=0;
        System.out.println("Enter the number of subjects: ");
        int n= sc.nextInt();
        System.out.println("Enter marks of "+n+" subjects from 1 to 10: ");
        
        
        for(int i=1;i<=n;i++){
            double marks=sc.nextDouble();
            sum=sum+marks;

        }
        double cgpa=sum/n;
        System.out.println("The CGPA is: "+cgpa);
    }
}
