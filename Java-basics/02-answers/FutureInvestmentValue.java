public class FutureInvestmentValue {
    public static void main(String[] args) {
        double investment=10000;
        double rate=5/100.0;
        double time=3;
        double futureValue=investment*Math.pow(1+rate,time);
        System.out.println("The future investment value is: "+futureValue);

    }
}
