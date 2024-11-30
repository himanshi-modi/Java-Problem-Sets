import java.util.Scanner;
public class greet {
    public static void main(String args[]){
        Scanner name1=new Scanner(System.in);
        System.out.println("Enter your name: ");
        if (name1.hasNextLine()){
            String name=name1.nextLine();
            System.out.println("Hello, "+name+" I welcome you to learn java");
        }else{
            System.out.println("Enter a string");
        }
        name1.close();


    }
}
