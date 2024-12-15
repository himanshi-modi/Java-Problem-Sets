import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch =sc.next().charAt(0);

        if (ch == 'a'|| ch=='e' || ch=='o' || ch=='u' || ch=='i' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("It is vowel");
        }else{
            System.out.println("It is consonant");
        }
    }
}
