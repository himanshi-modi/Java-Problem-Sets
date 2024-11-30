import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner n1=new Scanner(System.in);
        System.out.println("Enter the principal to find simple interest");
        int principal=n1.nextInt();
        Scanner n2=new Scanner(System.in);
        System.out.println("Enter the rate to find simple interest");
        int rate=n2.nextInt();
        Scanner n3=new Scanner(System.in);
        System.out.println("Enter the time to find simple interest");
        int time=n3.nextInt();
        int interest=(principal*rate*time)/100;
        System.out.println(interest + " is the simple interest");

    }
}
