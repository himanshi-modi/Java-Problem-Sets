public class PerfectNumber {
    public static void main(String[] args) {
        int number=28;
        int sum=0;

        for(int i=1;i<=number/2;i++){
            if (number%i==0){
                sum=sum+i;
            }
        }
        if (sum==number){
            System.out.println(number+" is perfect number.");
        }else{
            System.out.println(number +" is not a perfect number.");
        }
    }
}