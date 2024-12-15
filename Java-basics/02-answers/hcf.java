import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        int a=Math.max(no1,no2);
        int b=Math.min(no1,no2);

        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
            
            

        }

        
        System.out.println("The hcf is: "+a);

    }
}
