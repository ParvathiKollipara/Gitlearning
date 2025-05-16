class WhileTerLeapYear
{
      public static void main(String[] args)
       {
            int start = 1, end = 10, table = 8 ;
            while (start <= end)
            {
                System.out.println ( (start%4==0 && start%100!=0 || start%400 == 0) ? start%6 == 0 ? start+ " is a Leap Year  and divisible by 6" : start+ " is not a Leap Year and not divisible by 6" );
                start++;
            }
      }
} 
