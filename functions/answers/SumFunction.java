import java.util.Scanner;
public class SumFunction {  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int no1=sc.nextInt();
        System.out.println("Enter second number: ");
        int no2=sc.nextInt();

        int ans=sum(no1,no2);
        System.out.println("Sum is "+ans);
    }
    static int sum(int no1,int no2){
        int ans=no1+no2;
        return ans;
    }
}
