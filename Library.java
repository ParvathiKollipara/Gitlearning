class Library
{
    public static void main(String[] args)
    {
     int days=25;
     int bookprice=600;
     int perday=10;
     if(days <= 15)
     {
       System.out.println("No charges Applied");
     }
     else if(days > 15)
     {
      int price=bookprice*perday*15;
      System.out.println("Charges Applied");
      System.out.println(price);
     }
     else if(days > 30)
     {
      int price=bookprice*perday*30;
      System.out.println("Charges Applied");
      System.out.println(price);
     }
    else{
      System.out.println("Extra charge include per day");
    }
}
}























