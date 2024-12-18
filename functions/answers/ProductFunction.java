import java.util.Scanner;
public class ProductFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int no1=sc.nextInt();

        System.out.println("Enter the first number: ");
        int no2=sc.nextInt();

        int ans=product(no1,no2);
        System.out.println(ans);

    }
    static int product(int no1,int no2){
        int ans=no1*no2;
        return ans;
    }
}
