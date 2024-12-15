public class Lcm {
    public static void main(String[] args) {
        int a=34;
        int b=12;
        int mul=a*b;

        while(b!=0){
            int temp=a;
            a=b;
            b=temp%a;
        }
        System.out.println(a);
        int lcm=mul/a;
        System.out.println("The lcm  is: "+lcm);
    }
}
