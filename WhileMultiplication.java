class WhileMultiplication
{
        public static void main(String[ ] args)
        {
           int start = 1, end = 20, table = 5;
           while(start<=end)
           {
               int product = table*start;
               System.out.println(table+ " X " +start+ " = " +product);
               start++;
           }
      }
}