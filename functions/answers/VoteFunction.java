
public class VoteFunction {
    public static void main(String[] args) {
        int age=34;
        votingEligibility(age);
    }
    static void votingEligibility(int age){
        if (age<18){
            System.out.println(age+" is not a valid age to vote.");
        }else{
            System.out.println(age +" is valid age to vote ,You can vote.");
        }
    }
}
