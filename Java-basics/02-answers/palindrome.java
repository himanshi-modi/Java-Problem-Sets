public class palindrome {
    public static void main(String[] args) {
        String name="mom";
        boolean ispalandrome=true;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                ispalandrome=false;
                break;
            }
        }
        if (ispalandrome){
            System.out.println("It is palandrome.");
        }else{
            System.out.println("It is not palandrome.");
        }
    }
}
