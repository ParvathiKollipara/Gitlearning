class WhileFactorMax
{
      public static void main(String[ ] args)
      {
           int num = 500;
           int start = 1, end = num, count = 0, sum = 0, max = 0, min = 1, nextmin = 0;
           while(start<end)
           {
              if(num%start == 0)
              {
                if(nextmin == 0 && start >min)
                {
                  nextmin = start;
                }
                  max = start;
                  sum = sum + start;
                  count++;
                  System.out.println(start);
              }
             start++;
           }
          System.out.println("Count is " +count);
          System.out.println("Sum is " +sum);
          System.out.println("Largest Factor is " +max);
         System.out.println("Smallest Factor after 1 is " +nextmin);
      }
}