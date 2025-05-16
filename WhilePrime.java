class WhilePrime
{
      public static void main(String[ ] args)
      {
            int num = 89;
            int start = 1, end = num, count = 0;
            System.out.println("Factors of num is " +num);
            while(start<=end)
            {
               if(num%start == 0)
               {
                  count++;
                 System.out.println(start);
               }
              start++;


            }
         System.out.println("Count is " +count);
         System.out.println(count == 2 ? "Prime Number" : "Not a Prime Number");
         System.out.println(count == 4 ? "Super Number" : "Not a Super Number");
     }
}

         