class PalindromePrime
{
      public static void main(String[ ] args)
      {
          int num = 15, rem =0, start =1, end = num, temp = num, count =0, rev =0;
          while(start<=end)
          {
             if(num%start == 0)
             {
                count++;
               
              }
             start++;
         }
        while(num!=0)
        {
          rem = num%10;
          rev = rev*10+rem;
          num = num/10;
        }
        if(count == 2 && rev == temp)
       {
         System.out.println("Palindrome Prime");
       }
      else{
         System.out.println("Not a Palindrome Prime");
        }
   }
}
     
