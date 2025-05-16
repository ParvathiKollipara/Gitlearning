class Rev
{
       public static void main(String[ ] args)
       {
            int n = 1200, rev = 0, rem =0, temp = n;
            while(n!=0)
            {
                rem = n%10;
                rev = rev*10+rem;
                n = n/10;
             }

     }
}