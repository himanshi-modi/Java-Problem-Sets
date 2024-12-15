public class SubractProductAndSumOfDigit {
    public static void main(String[] args) {
        int a=134;
        String str=Integer.toString(a);
        int product=1;
        int sum=0;
        for(int i=0;i<str.length();i++){
            product=product*(int)(str.charAt(i)-'0');
            
            
            sum=sum+(int)(str.charAt(i)-'0');


        }
        int ans=product-sum;
        System.out.println("The difference of product and sum is : "+ans);
        
    }
}
