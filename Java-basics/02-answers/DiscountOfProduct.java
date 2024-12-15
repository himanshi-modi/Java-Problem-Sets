public class DiscountOfProduct {
    public static void main(String[] args) {
        int discountPercentage=10;
        int price=800;

        int discountAmount=price*(discountPercentage/100);

        int discountPrice=price-discountAmount;
        System.out.println("The discount of a product is"+discountPrice);

    }
}
