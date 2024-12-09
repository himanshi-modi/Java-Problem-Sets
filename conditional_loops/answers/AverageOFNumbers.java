public class AverageOFNumbers{
    public static void main(String[] args) {
        int sum=0;
        int n=15;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        int average=sum/n;
        System.out.println("The average is "+average);
    }
}
