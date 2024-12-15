public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        String newStr="";

        for(int i=str.length()-1;i>=0;i--){
            newStr+=str.charAt(i);
        }
        System.out.println("The reversed string is: "+newStr);
    }
}
