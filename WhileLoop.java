class WhileLoop
{
        public static void main(String[ ] args)
        {
             int start = 1, end = 100;
             int product = 1;
             while(start<=end)
             {
                product = product*start;
                System.out.println("The 100 numbers is: " + product);

                start++;
             }
       }
}