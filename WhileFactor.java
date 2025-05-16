class WhileFactor
{
      public static void main(String[ ] args)
      {
           int num = 25;
           int start = 1, end = num,count = 0, sum = 0;
           while(start<=end)
           {
              if(num%start == 0)
              {
                  sum = sum + start;
                  count++;
                  System.out.println(start);
               }
             start++;
           }
          System.out.println("Count is " +count);
          System.out.println("Sum is " +sum);
     }
}