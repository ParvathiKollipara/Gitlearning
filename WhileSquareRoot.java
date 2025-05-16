class WhileSquareRoot
{
      public static void main(String[ ] args)
      {
            int start = 1, end = 10;
            while(start<=end)
            {
               int square = (int)(Math.sqrt(start));
               System.out.println(start+ " square root is " +square);
               start++;
            }
      }
}