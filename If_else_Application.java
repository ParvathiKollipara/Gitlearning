   class If_else_Application
   { 
   public static void main(String[] args)
   {
    String company_name="Atos";
    String product_name="Washing_Machine";
    String brand="SAMSUNG";
    String Model="GRWIUTR";
    int price=75000;
    double capacity=12.5;
    float quantity=5.0f;
    short tax=53;
    byte charges=(byte)(1500);
    boolean smart=true;
    char color='S';//Silver
    long id=14598;
    int total=(int)(price*quantity);
    double discount=15*total/100;
    int newprice=(int)(total-discount);
    if(total > newprice)
    {
     System.out.println("Discount Applied");
    }else if(total == newprice){
     System.out.println("Discount is neutal, No change in price");
    }else if(discount > 0 && discount <= 5000){
      System.out.println("Small discount Applied");
    }else if(discount > 5000 && discount <= 15000){
       System.out.println("Medium discount Applied");
    }else if(discount > 15000){
       System.out.println("High discount Applied");
    }else{
       System.out.println("No discount Applied");
    }
    System.out.println("Total is: " + total);
    System.out.println("New price affter 15% discount is: " + newprice);
    System.out.println("Discount amount is: " +discount);
   }
}