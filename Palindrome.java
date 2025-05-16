class Palindrome
{
      public static void main(String[ ] args)
      {
          String n = Madam; 
          int rem = 0, rev =0, temp =n;
          while(n!=0)
          {
              rem = n%10;
              rev = rev*10+rem;
              n = n/10;
           }
         System.out.println(rev == temp ? "Palindrome Number" : "Not a Palindrome Number");
     }
}