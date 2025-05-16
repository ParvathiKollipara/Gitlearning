class WhileLeapYearCheckingDivisible
{
           public static void main(String[ ] args)
           {
              int start = 1800, end = 2000;
              while(start<=end)
              {
                 if(start%4==0 && start%100!=0 || start%400 == 0)
                 {
                     if(start%6 == 0)
                     {
                         System.out.println(start+ " is a Leap Year  and divisible by 6");
                     }
                    else{
                        System.out.println(start+ " is not a Leap Year and not divisible by 6");
                    }
              start++;
             }
  
      }
}
}