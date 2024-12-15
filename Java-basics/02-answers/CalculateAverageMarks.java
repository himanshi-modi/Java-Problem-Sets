import java.util.Scanner;
public class CalculateAverageMarks {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int totalSubject=sc.nextInt();
        double sum=0;
        System.out.print("Enter the marks of each subject : ");
        for(int i=1;i<=totalSubject;i++){
            double marks=sc.nextDouble();

            sum=sum+marks;
        }
        double average=sum/totalSubject;
        System.out.print("The average of all marks is: "+average);
    }
}
