class WhileLeapYear
{
        public static void main(String[ ] args)
        {
           int start = 1800, end = 2000;
           while(start<=end)
           {
              if(start%4==0 && start%100!=0 || start%400 == 0)
              {
                  System.out.println(start+ " is a Leap Year ");
               }
             start++;
          }
    }
}