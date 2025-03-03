class Last_Digit
{
     public static void main(String[] args)
     {
        int num1=65, num2=50;
        if(num1>num2)
        {
          int lastdigit1 = num1 % 10;
          int lastdigit2 = num2 % 10;
          String combinednumber =(lastdigit1 +""+ lastdigit2);
          System.out.println("Combined last two digits as a single number: " +combinednumber);
        }
        else
        {
          int sum =num1+num2;
          System.out.println("The sum of two numbers is " +sum);
        }
     }
}
          