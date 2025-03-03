class Application
{
    public static void main(String[] args)
    {
     String companyName="XYZ";
     String productName ="Laptop";
     long coupons=8765;
     double price=60000.85;
     int quantity=30;
     short deliveryCharges=(byte)(150);
     byte tax=89;
     String paymentMode="GooglePay";
     double total=(price*quantity)+deliveryCharges+tax;
     double discount=20*total/100;
     double finalPrice=total-discount; 
     double extraDiscount=5*total/100;
     double finalPriceAfterExtraDiscount=finalPrice-extraDiscount;
     System.out.println("Company Name: " + companyName);
     System.out.println("Product Name: " + productName);
     System.out.println("Price: " +price);
     System.out.println("Quantity: " + quantity);
     System.out.println("Delivery Charges: " + deliveryCharges);
     System.out.println("Tax: " + tax);
     System.out.println("Payment Mode: " + paymentMode);
     System.out.println("Total Price: " + total);
     System.out.println("Discount (20%): " + discount); 
     System.out.println("Final Price After Discount: " + finalPrice);
     System.out.println("Extra Discount (5%): " + extraDiscount);
     System.out.println("Final Price After Extra Discount: " + finalPriceAfterExtraDiscount);
     }
}