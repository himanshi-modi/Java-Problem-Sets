import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner m1=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=m1.nextInt();

        for(int i=1;i<=10;i++){
            int mul=n*i;
            System.out.println(n+"x"+i+"="+mul);
        }
    }
}
