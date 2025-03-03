class Car{
    public static void main(String[] args)
    {
    String company_Name = "Tesla";
    String product_Name = "Car";
    String car_Model = "Model S";
    long coupons = 5678;
    int price = 5000000;
    double quantity = 1.0;
    double batteryCapacity = 8.5;
    byte charges =(byte)(5000);
    short tax = 15000;
    char fuel_type = 'E';
    boolean self_Driving = true;
    float acceleration = 2.5f;
    float mileage = 8.4f;
    String engine_type ="Dual Motor";
    String speed = "320 km/h";
    String paymentMode = "GooglePay";
    double total = (price*quantity)+charges+tax;
    double discount = 20*total/100;
    double finalprice = total - discount;
    double extraDiscount = 10*total/100;
    double finalPriceAfterExtraDiscount = finalprice-extraDiscount;
    System.out.println("**************Car Purchase****************");
    System.out.println("Company Name: " + company_Name);                                
    System.out.println("Product Name: " + product_Name);
    System.out.println("Car Model: " + car_Model);
    System.out.println("Speed: " + speed);
    System.out.println("Battery Capacity: " + batteryCapacity);
    System.out.println("Engine type: " +engine_type);
    System.out.println("Self-Driving : " + self_Driving);
    System.out.println("Price of Car: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Price: " + total);
    System.out.println("Discount (20%): " + discount);
    System.out.println("Final Price: " + finalprice);
    System.out.println("Extra Discount: " + extraDiscount);
    System.out.println("Final Price After Extra Discount : " + finalPriceAfterExtraDiscount);
    }
}
    
  
    
    
    
    
    
    
    
    
    
    