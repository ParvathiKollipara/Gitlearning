class WhileMulEven
{
        public static void main(String[ ] args)
        {
            int start = 1, end = 10, table = 8 ;
            while (start <= end)
            {
               int num = start;
               if(num%2==0)
              {
                 int product = 1;
                  product = product*start;
                  System.out.println(table+ " x " +start+ " = " +product);
                  start++;
              }
             else
             { 
                 int odd_product= odd_product*start;
                 System.out.println(table+ " x " +start+ " = " +odd_product);
                 start++;
            }
      }
}
}
