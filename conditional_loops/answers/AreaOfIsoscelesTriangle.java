
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        double base=12;
        double side=13;
        double height=Math.sqrt(Math.pow(side,2)-Math.pow(base/2, 2)); //double gives answer preciously where as floats rounds off the value,thus used double instead of float.

        double area=(height*base)/2;

        System.out.println("The area of Isoscles Triangle is : "+area);
    }
}
