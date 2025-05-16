class WhileEvenProduct
{
         public static void main(String[ ] args)
         {
            int start = 1, end = 5, sum = 0, product = 1;
            while(start<=end)
            {
                 sum = sum+start;
                 System.out.println("Sum of " +start+ " and " +end+ " numbers is " +sum);
                 product = product*start;
                 System.out.println("Product of " +start+ " and " +end+ " numbers is " +product);
               start++;
            }
     }
}
