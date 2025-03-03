class Single_Digit
{
    public static void main(String[] args)
    {
         int n = 5;
         if(n>= 0 && n<=9)
            System.out.println("Number is " + n);
        else if(n <= 99)
            System.out.println(n%10);
        else if(n<=1000)
             System.out.println(n%100);
        else
            System.out.println("Invalid");
   }
}

