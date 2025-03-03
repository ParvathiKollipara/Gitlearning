xclass Application
{
    public static void main(String[] args)
    {
     String Companyname="XYZ";
     String Product_name ="Laptop";
     long coupons=8765;
     int price=60000;
     double quantity=30.8;
     byte charges=(byte)(500);
     short tax=(short)(89);
     double total=(price*quantity)+charges+tax;
     double discount=50*total/100;
     double final_price=total-discount;
     System.out.println(total);
     System.out.println(discount);
     System.out.println(final_price);
     }
}