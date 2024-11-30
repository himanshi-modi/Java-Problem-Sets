public class armstrong {
    public static void main(String[] args) {
        int n=153;
        String str=String.valueOf(n);
        int sum=0;
        int ans=0;
        for(int i=0;i<str.length();i++){
            int digit=Character.getNumericValue(str.charAt(i));
            sum += Math.pow(digit, str.length());

        }
        System.out.println(sum);
    }
}
