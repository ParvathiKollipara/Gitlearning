class WhileNandNminusRfactorial
{
         public static void main(String[ ]  args)
         {
             int n = 5, r = 3, start = 1, end = n;
             int n_product = 1, nr_product = n-r;
             while(start<=end)
             {
               n_product = n_product*start;
               start++;
             }
            System.out.println(n+ "factorial is " +n_product);
            int nr_start = 1, nr_end = n-r, nr_pro = 1;
            while(nr_start<=nr_end)
            {
               nr_product = nr_pro*nr_start;
               nr_start++;
             }
             System.out.println(n+ "minus " +r+ "factorial is " +nr_product);
            System.out.println((n_product)/(nr_product));
        }
}
              