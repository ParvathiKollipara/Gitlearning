class WhileCountDivisible
{
         public static void main(String[ ] args)
         {
               int start = 1, end = 100, count = 0;
               while(start<=end)
               {
                
                  if(start%3 == 0 && start %5==0)
                  {
                      count++;
                      System.out.println(start);
                   }
                  start++;
               }
             System.out.println("Count is " +count);
      }
}