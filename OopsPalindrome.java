class OopsPalindrome
{
       public static void main(String[ ] args)
       {
           Palindrome p = new Paliindrome();
           int result = p.isPalindrome(101,0,0);
           System.out.println(p.checkPalindrome(result));
        }
}
class Main
{
      int isPalindrome(int num, int rem, int rev)
      {
         while(num>0)
         {
             rem = num%10;
             rev = rev*10+rem;
             num = num/10;
          }
      return rev;
      }
      String checkPalindrome(int rev)
      {
           if(rev==num)
                return "Palindrome";
           else
                 return "Not a Palindrome";
       }
}