import java.util.Scanner;
public class Sumofinput {
    public static void main(String[] args) {
        int sum=0;
        Scanner obj= new Scanner(System.in);
        

        while(true){
            System.out.println("Enter a number or enter 0 to stop");
            int input=obj.nextInt();
            if (input==0){
                break;
            }
            sum=sum+input;
            
        }
        System.out.println("The sum is: "+sum);
        

        
        
        

    }
}
