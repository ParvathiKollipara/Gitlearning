class MulEight
{
       public static void main(String[ ] args)
        {
              int start = 10, end = 1, table = 8;
              while(start>=end)
              {
                  int product = table*start;
                  System.out.println(table+ " x " +start+ " = " +product);
                  start--;
              }
      }
}